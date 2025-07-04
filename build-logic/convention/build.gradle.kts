import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "com.bcsdlab.internal.convention"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17)
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.compiler.gradlePlugin)
    compileOnly(libs.compose.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("internalApplication") {
            id = "com.bcsdlab.internal.plugin.application"
            implementationClass = "InternalApplicationPlugin"
        }
        register("internalFeature") {
            id = "com.bcsdlab.internal.plugin.feature"
            implementationClass = "InternalFeaturePlugin"
        }
        register("internalLibrary") {
            id = "com.bcsdlab.internal.plugin.library"
            implementationClass = "InternalLibraryPlugin"
        }
    }
}