plugins {
    id("java")
   id("com.diffplug.spotless") version "5.0.0"
    //id("com.diffplug.spotless' version") version "5.0.0"


}

group = "com.aogaga"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.googlejavaformat:google-java-format:1.24.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

spotless {
    java {
        target("src/**/*.java")
        googleJavaFormat()
        importOrder()
        removeUnusedImports()
        trimTrailingWhitespace()
        endWithNewline()
        licenseHeaderFile(rootProject.file("LICENSE_HEADER.txt"))


    }
}
tasks.test {
    useJUnitPlatform()
}

