# Fix Build Error: Could Not Resolve org.jetbrains.compose.material:material-icons-extended:1.11.1

The project is currently attempting to use version `1.11.1` for the `org.jetbrains.compose.material:material-icons-extended` library, which is the same version as the Compose Multiplatform plugin. However, this specific library (and other icon libraries in the Compose Multiplatform suite) is intentionally pinned to an older version (`1.7.3`) by JetBrains to manage build times and binary size.

## Proposed Changes

### Build Configuration

#### [MODIFY] [libs.versions.toml](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/gradle/libs.versions.toml)
- Add a new version entry `composeIcons = "1.7.3"` to the `[versions]` section.
- Update the `compose-material-icons-extended` library definition to use `version.ref = "composeIcons"` instead of `version.ref = "composeMultiplatform"`.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:shared:assembleDebug` (or equivalent sync/build task) to verify that the dependency is now resolved correctly.
- Perform a Gradle Sync in Android Studio.

### Manual Verification
- Verify that the IDE no longer shows resolution errors for Material Icons in the shared module.
