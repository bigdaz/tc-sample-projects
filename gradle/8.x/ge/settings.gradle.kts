plugins {
  id("com.gradle.enterprise") version "3.16.2"
}

rootProject.name = "gradle-sample-8.x-dv"

gradleEnterprise {
  server = "https://ge.solutions-team.gradle.com"
  buildScan {
    publishAlways()
  }
}
