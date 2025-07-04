import com.android.build.gradle.LibraryExtension
import com.bcsdlab.internal.convention.configureAndroidProject
import com.bcsdlab.internal.convention.configureMultiplatformProject
import com.bcsdlab.internal.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class InternalLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.findPlugin("kotlinMultiplatform").get().get().pluginId)
                apply(libs.findPlugin("androidLibrary").get().get().pluginId)
            }

            extensions.configure<LibraryExtension> {
                configureAndroidProject(this)
            }

            extensions.configure<KotlinMultiplatformExtension> {
                configureMultiplatformProject(this)
            }
        }
    }
}