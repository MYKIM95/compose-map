plugins {
    id(ProjectPlugins.ANDROID_LIBRARY)
    id(ProjectPlugins.JETBRAINS_ANDROID)
    id(ProjectPlugins.HILT_GRADLE)
    kotlin(ProjectPlugins.KAPT)
}

android {
    compileSdk = BuildConfig.COMPILE_SDK

    defaultConfig {
        minSdk = BuildConfig.MIN_SDK
        targetSdk = BuildConfig.TARGET_SDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(Modules.CORE_DATABASE))
    implementation(project(Modules.CORE_NETWORK))
    implementation(project(Modules.COMMON_MODEL))
    implementation(project(Modules.COMMON_UTIL))
    implementationDependencies(Modules.CORE_DATA)
}

kapt {
    correctErrorTypes = true
}