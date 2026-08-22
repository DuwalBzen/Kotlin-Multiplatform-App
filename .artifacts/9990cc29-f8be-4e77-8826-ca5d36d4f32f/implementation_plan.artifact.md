# Fix Unresolved Android SDK References

The user is unable to import `android.content.Context` in the shared module's `androidMain`. This is caused by using SDK version 37, which is likely not installed or not yet available in the current environment, leading to a failure in linking the Android platform libraries.

## User Review Required

> [!IMPORTANT]
> I am downgrading the Android SDK, AGP, and Kotlin versions to stable releases (SDK 35, AGP 8.7.3, Kotlin 2.0.21) to ensure the project can find the Android platform classes.

## Proposed Changes

### Build Configuration

#### [MODIFY] [libs.versions.toml](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/gradle/libs.versions.toml)
- Set `android-compileSdk` and `android-targetSdk` to `35`.
- Set `agp` to `8.7.3`.
- Set `kotlin` to `2.0.21`.
- Set `ksp` to `2.0.21-1.0.27`.

## Verification Plan

### Automated Tests
- Run Gradle Sync to verify all plugins and SDKs are resolved.
- Build the shared module: `./gradlew :app:shared:assemble`.

### Manual Verification
- Check [AppDatabase.android.kt](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/app/shared/src/androidMain/kotlin/com/example/kmpfirstapp/data/db/database/AppDatabase.android.kt) to confirm `android.content.Context` is no longer red.
