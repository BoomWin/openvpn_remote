plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.openvpn_remote_app"
    compileSdk = 34


    // AIDL 을 사용하기 위해 gradle 수정
    buildFeatures {
        aidl = true;
    }

    defaultConfig {
        applicationId = "com.example.openvpn_remote_app"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // OpenVPN 라이브러리 추가
//    implementation("com.github.schwabe:android-openvpn:0.7.22")

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
