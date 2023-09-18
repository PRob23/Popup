import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

object Dependencies {
    object Binary {
        internal const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.ANDROIDX_ACTIVITY}"
        internal const val COMPOSE_MATERIAL = "androidx.compose.material:material:${Versions.ANDROIDX_COMPOSE}"
        internal const val COMPOSE_UI_UI = "androidx.compose.ui:ui:${Versions.ANDROIDX_COMPOSE}"
        internal const val COMPOSE_UI_UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${Versions.ANDROIDX_COMPOSE}"
        internal const val CORE_KTX = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE}"
        internal const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
        internal const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
        internal const val HILT_ANDROIDX_COMPILER = "androidx.hilt:hilt-compiler:${Versions.ANDROIDX_HILT}"
        internal const val HILT_NAVIGATION_COMPOSE = "androidx.hilt:hilt-navigation-compose:${Versions.ANDROIDX_HILT}"
        internal const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.ANDROIDX_LIFECYCLE}"
        internal const val LIFECYCLE_VIEWMODEL_COMPOSE = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.ANDROIDX_LIFECYCLE}"
        internal const val NAVIGATION_COMPOSE = "androidx.navigation:navigation-compose:${Versions.ANDROIDX_NAVIGATION}"
    }

    object Project {
        internal const val DATA = ":data"
        internal const val DOMAIN = ":domain"
        internal const val PRESENTATION = ":presentation"
    }

    private const val IMPLEMENTATION_CONFIGURATION = "implementation"

    private const val KAPT_CONFIGURATION = "kapt"

    fun applyAppDependencies(dependencyHandler: DependencyHandler) {
        dependencyHandler.apply {
            add(IMPLEMENTATION_CONFIGURATION, Binary.HILT_ANDROID)
            add(KAPT_CONFIGURATION, Binary.HILT_ANDROID_COMPILER)
            add(IMPLEMENTATION_CONFIGURATION, project(Project.DOMAIN))
            add(IMPLEMENTATION_CONFIGURATION, project(Project.DATA))
            add(IMPLEMENTATION_CONFIGURATION, project(Project.PRESENTATION))
        }
    }

    fun applyDataDependencies(dependencyHandler: DependencyHandler) {
        dependencyHandler.apply {
            add(IMPLEMENTATION_CONFIGURATION, project(Project.DOMAIN))
            add(IMPLEMENTATION_CONFIGURATION, Binary.HILT_ANDROID)
            add(KAPT_CONFIGURATION, Binary.HILT_ANDROID_COMPILER)
        }
    }

    fun applyPresentationDependencies(dependencyHandler: DependencyHandler) {
        dependencyHandler.apply {
            add(IMPLEMENTATION_CONFIGURATION, Binary.HILT_ANDROID)
            add(KAPT_CONFIGURATION, Binary.HILT_ANDROID_COMPILER)
            add(KAPT_CONFIGURATION, Binary.HILT_ANDROIDX_COMPILER)
            add(IMPLEMENTATION_CONFIGURATION, Binary.HILT_NAVIGATION_COMPOSE)
            add(IMPLEMENTATION_CONFIGURATION, Binary.CORE_KTX)
            add(IMPLEMENTATION_CONFIGURATION, Binary.LIFECYCLE_RUNTIME_KTX)
            add(IMPLEMENTATION_CONFIGURATION, Binary.LIFECYCLE_VIEWMODEL_COMPOSE)
            add(IMPLEMENTATION_CONFIGURATION, Binary.ACTIVITY_COMPOSE)
            add(IMPLEMENTATION_CONFIGURATION, Binary.NAVIGATION_COMPOSE)
            add(IMPLEMENTATION_CONFIGURATION, Binary.COMPOSE_UI_UI)
            add(IMPLEMENTATION_CONFIGURATION, Binary.COMPOSE_UI_UI_TOOLING_PREVIEW)
            add(IMPLEMENTATION_CONFIGURATION, Binary.COMPOSE_MATERIAL)
            add(IMPLEMENTATION_CONFIGURATION, project(Project.DOMAIN))
        }
    }
}
