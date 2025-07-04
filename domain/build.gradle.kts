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
    namespace = "com.bcsdlab.internal.domain"

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
}
