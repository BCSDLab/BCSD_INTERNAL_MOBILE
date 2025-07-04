plugins {
    alias(libs.plugins.internal.library)
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
    namespace = "com.bcsdlab.internal.core"

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
}
