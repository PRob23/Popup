import org.gradle.api.artifacts.dsl.DependencyHandler

object DebugDependencies {
    const val COMPOSE_UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest:${Versions.ANDROIDX_COMPOSE}"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.ANDROIDX_COMPOSE}"

    private const val DEBUG_IMPLEMENTATION_CONFIGURATION = "debugImplementation"

    fun applyAppDependencies(dependencyHandler: DependencyHandler) {
        dependencyHandler.apply {
            add(DEBUG_IMPLEMENTATION_CONFIGURATION, COMPOSE_UI_TOOLING)
            add(DEBUG_IMPLEMENTATION_CONFIGURATION, COMPOSE_UI_TEST_MANIFEST)
        }
    }
}
