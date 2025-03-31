plugins {
  id("java")
}

repositories {
  mavenCentral()
}

// Using guava 32.1.2 in Gradle 6.x requires additional configuration in the Java plugin:
// https://github.com/google/guava/releases/tag/v32.1.0
sourceSets.all {
  configurations.getByName(runtimeClasspathConfigurationName) {
    attributes.attribute(Attribute.of("org.gradle.jvm.environment", String::class.java), "standard-jvm")
  }
  configurations.getByName(compileClasspathConfigurationName) {
    attributes.attribute(Attribute.of("org.gradle.jvm.environment", String::class.java), "standard-jvm")
  }
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
