import com.android.build.api.dsl.ApplicationExtension
import com.bcsdlab.internal.convention.configureAndroidProject
import com.bcsdlab.internal.convention.configureComposeProject
import com.bcsdlab.internal.convention.configureMultiplatformProject
import com.bcsdlab.internal.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class InternalApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.findPlugin("kotlinMultiplatform").get().get().pluginId)
                apply(libs.findPlugin("androidApplication").get().get().pluginId)
                apply(libs.findPlugin("composeMultiplatform").get().get().pluginId)
                apply(libs.findPlugin("composeCompiler").get().get().pluginId)
                apply(libs.findPlugin("composeHotReload").get().get().pluginId)
                apply(libs.findPlugin("kotlinx-serialization").get().get().pluginId)
                apply(libs.findPlugin("ktlint").get().get().pluginId)
            }

            extensions.configure<ApplicationExtension> {
                configureAndroidProject(this)
            }

            extensions.configure<KotlinMultiplatformExtension> {
                configureMultiplatformProject(this)
                configureComposeProject(this)
            }
        }
    }
}