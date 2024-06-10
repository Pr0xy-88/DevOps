package ru.test.utils
class buildUtils {
  static def timedGradleBuild(script, task) {
    def gradleHome = script.tool 'gradle 3.2'
    script.sh "echo Buildings for ${script.env.BUILD_TAG}"
    script.sh timestapms {
      script.sh "${gradle.home}/bin/gradle ${tasks}"
    }
  }
}
