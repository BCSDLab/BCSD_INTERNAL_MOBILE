plugins {
    alias(libs.plugins.internal.feature)
    alias(libs.plugins.internal.orbit)
}

kotlin {
    sourceSets {
        androidMain.dependencies {
        }

        commonMain.dependencies {
            implementation(project.dependencies.platform(libs.koin.bom))

            implementation(libs.androidx.navigation.compose)

            implementation(libs.koin.core)
            implementation(libs.koin.compose)
            implementation(libs.koin.compose.viewmodel)
            implementation(libs.koin.compose.viewmodel.navigation)
        }
    }
}

android {
    namespace = "com.bcsdlab.internal.feature.main"

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
}
