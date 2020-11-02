plugins {
    kotlin("jvm") version "1.4.10"
}

group = "com.sky.nn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(group = "org.ejml", name = "ejml-all", version = "0.39")
}
