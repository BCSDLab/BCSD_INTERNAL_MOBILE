plugins {
    alias(libs.plugins.internal.library)
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
    namespace = "com.bcsdlab.internal.domain"

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
}
