plugins {
    alias(libs.plugins.internal.feature)
    alias(libs.plugins.internal.orbit)
}

kotlin {
    sourceSets {
        androidMain.dependencies {
        }

        commonMain.dependencies {
            implementation(projects.designsystem)

            implementation(project.dependencies.platform(libs.koin.bom))

            implementation(libs.koin.core)
            implementation(libs.koin.compose)
            implementation(libs.koin.compose.viewmodel)
        }
    }
}

android {
    namespace = "com.bcsdlab.internal.feature.signin"

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
}
