plugins {
    id("moviebox.library.compose")
    id("moviebox.code.quality")
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.majorkik.ui.nav.search"

    libraryVariants.all {
        kotlin.sourceSets {
            getByName(name) { kotlin.srcDir("build/generated/ksp/$name/kotlin") }
        }
    }

    ksp {
        arg("compose-destinations.moduleName", "search")
        arg("compose-destinations.mode", "destinations")
    }
}

dependencies {
    implementation(projects.core.ui)
    implementation(projects.feature.tmdb.api)
    implementation(projects.core.localizaton)

    implementation(libs.bundles.logging)

    implementation(libs.koin.compose)
    implementation(libs.mvi.orbit)

    implementation(libs.coil)

    implementation(libs.accompanist.pager)
    implementation(libs.accompanist.pager.indicators)

    implementation(libs.klock)

    implementation(libs.compose.destinations.core)
    ksp(libs.compose.destinations.ksp)
}
