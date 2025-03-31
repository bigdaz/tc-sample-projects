plugins {
  id("com.gradle.develocity") version "3.19.2"
  id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2.1"
}

rootProject.name = "gradle-sample-8.x-dv"

develocity {
  server = "https://ge.solutions-team.gradle.com"
}
