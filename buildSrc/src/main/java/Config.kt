import org.gradle.api.JavaVersion

object Config {

    object AppInfo {
        const val NAME_SPACE = "com.robertpapp.popup"
        const val APPLICATION_ID = "com.robertpapp.popup"
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0"
    }

    object NameSpaces {
        const val APP = "com.robertpapp.popup"
        const val DATA = "com.robertpapp.popup.data"
        const val DOMAIN = "com.robertpapp.popup.domain"
        const val PRESENTATION = "com.robertpapp.popup.presentation"
    }

    object SdkVersions {
        const val MINIMUM = 21
        const val COMPILE = 33
        const val TARGET = 33
    }

    object JavaOptions {
        val JAVA_VERSION = JavaVersion.VERSION_1_8
        val JAVA_VERSION_STRING = "1.8"
    }
}
