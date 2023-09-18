import org.gradle.api.JavaVersion

object Config {

    object AppInfo {
        const val NAME_SPACE = "com.gyulajuhasz.popupgenyo"
        const val APPLICATION_ID = "com.gyulajuhasz.popupgenyo"
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0"
    }

    object NameSpaces {
        const val APP = "com.gyulajuhasz.popupgenyo"
        const val DATA = "com.gyulajuhasz.popupgenyo.data"
        const val DOMAIN = "com.gyulajuhasz.popupgenyo.domain"
        const val PRESENTATION = "com.gyulajuhasz.popupgenyo.presentation"
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
