plugins {
  id("java")
}

repositories {
  mavenCentral()
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
