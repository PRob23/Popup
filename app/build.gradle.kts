plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    // Hilt
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = Config.NameSpaces.APP
    compileSdk = Config.SdkVersions.COMPILE

    defaultConfig {
        applicationId = Config.AppInfo.APPLICATION_ID
        minSdk = Config.SdkVersions.MINIMUM
        targetSdk = Config.SdkVersions.TARGET
        versionCode = Config.AppInfo.VERSION_CODE
        versionName = Config.AppInfo.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            isDebuggable = false
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
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    Dependencies.applyAppDependencies(this)
    TestDependencies.applyAppDependencies(this)
    DebugDependencies.applyAppDependencies(this)
}

kapt {
    correctErrorTypes = true
}
