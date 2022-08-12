plugins {
    id("kotlin")
    id("application")
}

application {
    mainClassName = "me.szymanski.apkupload.Main"
}

dependencies {
    implementation("com.google.auth:google-auth-library-oauth2-http:1.10.0")
    implementation("com.google.apis:google-api-services-androidpublisher:v3-rev142-1.25.0")
}
