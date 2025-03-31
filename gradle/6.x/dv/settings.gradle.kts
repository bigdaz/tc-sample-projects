plugins {
  id("com.gradle.develocity") version "3.19.2"
  id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2.1"
}

rootProject.name = "gradle-sample-6.x-dv"

develocity {
  server.set("https://ge.solutions-team.gradle.com")
}
