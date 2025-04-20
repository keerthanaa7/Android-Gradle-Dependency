plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.androidgradledependency"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.androidgradledependency"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    implementation("com.squareup.retrofit2:retrofit:2.9.0") // retrofit for network communication

    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // For JSON serialization/deserialization using Gson

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9") // kotlin coroutine for android

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0") // kotlin coroutine for core

    implementation("androidx.constraintlayout:constraintlayout:2.2.1") // constraint layout

    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.5") // lifecycle viewmodel compose

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.0") // lifecycle viewmodel

    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.0") // lifecyle viewmodel live data

    implementation("androidx.compose.foundation:foundation:1.6.4") // compose
    // coil dependency
    implementation("io.coil-kt:coil-compose:2.7.0") // coil for async image loading on compose

    implementation("com.github.bumptech.glide:compose:1.0.0-beta01") // glide for async image loading in compose

    implementation("androidx.recyclerview:recyclerview:1.4.0") // recycler view

    implementation("com.android.volley:volley:1.2.1") // volley for network communication

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0") // lifecycle compiler

    kapt("androidx.lifecycle:lifecycle-compiler:2.4.0") // kapt for lifecyle compiler

    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0") // okhttp logs intercepting
}