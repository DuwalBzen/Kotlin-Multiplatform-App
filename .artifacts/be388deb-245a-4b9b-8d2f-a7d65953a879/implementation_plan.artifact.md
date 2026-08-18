# Implementation Plan - Fix Compose Material Icons Resolution Error

The build is failing because `org.jetbrains.compose.material:material-icons-extended:1.11.1` cannot be found in Maven Central. While Compose Multiplatform version `1.11.1` is used for the runtime and other libraries, the Material Icons artifacts (both core and extended) are published under a different versioning scheme, currently at `1.7.3`.

## User Review Required

> [!NOTE]
> The Material Icons Extended library is significantly larger than other dependencies. Pinning it to a stable version like `1.7.3` is a standard practice in Compose Multiplatform to avoid resolution issues when the icons artifact isn't updated in sync with the core library.

## Proposed Changes

### Build Configuration

#### [MODIFY] [libs.versions.toml](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/gradle/libs.versions.toml)
- Add `composeIcons = "1.7.3"` to the `[versions]` section.
- Update `compose-material-icons-extended` to use `version.ref = "composeIcons"`.

## Verification Plan

### Automated Tests
- Run Gradle sync to verify dependency resolution.
- Run `./gradlew :app:shared:assembleDebug` to ensure the shared module builds successfully.

### Manual Verification
- Check the `build.gradle.kts` in `:app:shared` to ensure no red lines remain under the icons dependency.
