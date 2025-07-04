plugins {
    alias(libs.plugins.internal.library)
}

kotlin {
    sourceSets {
        val desktopMain by getting

        androidMain.dependencies {

        }

        commonMain.dependencies {
            implementation(project(":domain"))
        }

        desktopMain.dependencies {

        }
    }
}

android {
    namespace = "com.bcsdlab.internal.data"

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
}
