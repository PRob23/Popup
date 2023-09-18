import org.gradle.api.artifacts.dsl.DependencyHandler

object TestDependencies {
    const val JUNIT = "junit:junit:4.13.2"
    const val EXT_UNIT = "androidx.test.ext:junit:1.1.3"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
    const val COMPOSE_UI_TEST_JUNIT = "androidx.compose.ui:ui-test-junit4:${Versions.ANDROIDX_COMPOSE}"

    private const val TEST_IMPLEMENTATION_CONFIGURATION = "testImplementation"
    private const val ANDROID_TEST_IMPLEMENTATION_CONFIGURATION = "androidTestImplementation"

    fun applyAppDependencies(dependencyHandler: DependencyHandler) {
        dependencyHandler.apply {
            add(TEST_IMPLEMENTATION_CONFIGURATION, JUNIT)
            add(ANDROID_TEST_IMPLEMENTATION_CONFIGURATION, EXT_UNIT)
            add(ANDROID_TEST_IMPLEMENTATION_CONFIGURATION, ESPRESSO_CORE)
            add(ANDROID_TEST_IMPLEMENTATION_CONFIGURATION, COMPOSE_UI_TEST_JUNIT)
        }
    }
}
