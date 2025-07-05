plugins {
    alias(libs.plugins.internal.feature)
}

kotlin {
    sourceSets {
        val desktopMain by getting

        androidMain.dependencies {
        }

        commonMain.dependencies {
        }

        desktopMain.dependencies {
        }
    }
}

android {
    namespace = "com.bcsdlab.internal.designsystem"

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
}
