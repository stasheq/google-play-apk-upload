plugins {
    id("kotlin")
    id("application")
}

application {
    mainClassName = "me.szymanski.apkupload.Main"
}

dependencies {
    implementation("com.google.auth:google-auth-library-oauth2-http:0.22.0")
    implementation("com.google.apis:google-api-services-androidpublisher:v3-rev20201022-1.30.10")
}
