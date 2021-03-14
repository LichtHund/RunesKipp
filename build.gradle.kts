import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.31"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
    maven("https://repo.mattstudios.me/artifactory/public/")
}

dependencies {
    implementation("ch.qos.logback:logback-classic:1.2.1")
    implementation(kotlin("stdlib"))

    implementation("net.dv8tion:JDA:4.2.0_241")

    implementation("me.mattstudios:triumph-config:1.0.5-SNAPSHOT")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            javaParameters = true
        }
    }
}
