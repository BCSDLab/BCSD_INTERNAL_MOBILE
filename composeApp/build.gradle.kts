plugins {
    alias(libs.plugins.internal.application)
    alias(libs.plugins.internal.orbit)
}

kotlin {
    targets.configureEach {
        compilations.configureEach {
            compileTaskProvider.get().compilerOptions {
                // See: https://youtrack.jetbrains.com/issue/KT-61573
                freeCompilerArgs.add("-Xexpect-actual-classes")
            }
        }
    }

    sourceSets {
        androidMain.dependencies {
            implementation(compose.preview)
            implementation(libs.androidx.activity.compose)
            implementation(libs.koin.android)
            implementation(libs.kotlinx.coroutines.android)
        }
        commonMain.dependencies {
            implementation(projects.domain)
            implementation(projects.data)
            implementation(projects.core)
            implementation(projects.designsystem)
            implementation(projects.feature.main)
            implementation(projects.feature.signin)

            implementation(project.dependencies.platform(libs.koin.bom))
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtimeCompose)
            implementation(libs.androidx.navigation.compose)
            implementation(libs.koin.core)
            implementation(libs.koin.compose)
            implementation(libs.koin.compose.viewmodel)
            implementation(libs.koin.compose.viewmodel.navigation)
            implementation(libs.kotlinx.coroutines.core)
            implementation(libs.kotlin.stdlib)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.bcsdlab.internal"

    defaultConfig {
        applicationId = "com.bcsdlab.internal"
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    debugImplementation(compose.uiTooling)
}
