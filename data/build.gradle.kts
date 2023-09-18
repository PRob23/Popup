plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    // Hilt
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = Config.NameSpaces.DATA
    compileSdk = Config.SdkVersions.COMPILE

    defaultConfig {
        minSdk = Config.SdkVersions.MINIMUM

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = Config.JavaOptions.JAVA_VERSION
        targetCompatibility = Config.JavaOptions.JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = Config.JavaOptions.JAVA_VERSION_STRING
    }
}

dependencies {
    Dependencies.applyDataDependencies(this)
}

kapt {
    correctErrorTypes = true
}
