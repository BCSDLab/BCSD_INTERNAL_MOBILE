plugins {
    alias(libs.plugins.internal.feature)
}

kotlin {
    sourceSets {
        androidMain.dependencies {
        }

        commonMain.dependencies {
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
