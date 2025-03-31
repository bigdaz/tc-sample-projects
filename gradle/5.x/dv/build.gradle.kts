plugins {
  id("com.gradle.develocity") version "3.19.2"
  id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2.1"
  id("java")
}

repositories {
  mavenCentral()
}

develocity {
  server.set("https://ge.solutions-team.gradle.com")
}

dependencies {
  implementation("com.google.guava:guava:33.4.6-jre")
  testImplementation(platform("org.junit:junit-bom:5.12.1"))
  testImplementation("org.junit.jupiter:junit-jupiter")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test>().configureEach {
  useJUnitPlatform()
}
