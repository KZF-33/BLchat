pluginManagement {
    repositories {
        maven { url =uri("https://maven.aliyun.com/repository/google") }
        maven { url =uri("https://maven.aliyun.com/repository/releases") }
        maven { url =uri("https://maven.aliyun.com/repository/central") }
        maven { url =uri("https://maven.aliyun.com/repository/public") }
        maven { url =uri("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { url =uri("https://maven.aliyun.com/repository/apache-snapshots") }
        maven { url =uri("https://maven.aliyun.com/nexus/content/groups/public/") }
        maven { url =uri("https://jitpack.io") }
        google()
        mavenCentral()
        jcenter()
        gradlePluginPortal()

        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url =uri("https://maven.aliyun.com/repository/google")}
        maven { url =uri("https://maven.aliyun.com/repository/releases")}
        maven { url =uri("https://maven.aliyun.com/repository/central")}
        maven { url =uri("https://maven.aliyun.com/repository/public")}
        maven { url =uri("https://maven.aliyun.com/repository/gradle-plugin")}
        maven { url =uri("https://maven.aliyun.com/repository/apache-snapshots")}
        maven { url =uri("https://maven.aliyun.com/nexus/content/groups/public/")}
        maven { url =uri("https://jitpack.io")}
        google()
        mavenCentral()
        jcenter()
        gradlePluginPortal()

        google()
        mavenCentral()
    }
}

rootProject.name = "BLchat"
include(":app")

