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
    namespace = "com.bcsdlab.internal.core"

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
}
