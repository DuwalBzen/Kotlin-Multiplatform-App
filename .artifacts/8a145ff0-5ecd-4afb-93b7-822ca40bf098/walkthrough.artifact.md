# Walkthrough - Fixed KanjiViewModel Injection

I have fixed the `InstanceCreationException` occurring when the app tried to create an instance of `KanjiViewModel`.

## Changes

### DI Configuration

#### [KoinModule.kt](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/app/shared/src/commonMain/kotlin/com/example/kmpfirstapp/di/KoinModule.kt)

I updated the `initializeKoin` function to include the `platformModule`. This module contains the platform-specific `AppDatabase` definition (using Room), which is a required dependency for the `KanjiDao` and subsequently the `KanjiRepository` and `KanjiViewModel`. This fix applies to both Android and iOS.

```diff
     startKoin {
         config()
-        modules(koinModule, networkModule, databaseModule)
+        modules(koinModule, networkModule, databaseModule, platformModule)
     }
```

### Dependency Alignment

#### [build.gradle.kts](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/app/shared/build.gradle.kts)

I removed hardcoded Ktor versions (`2.0.0` and `3.2.3`) and aligned them to use the version defined in `libs.versions.toml` (`3.5.2`). This ensures binary compatibility on iOS and prevents crashes related to mixing different Ktor versions.

```diff
 iosMain.dependencies {
-    implementation("io.ktor:ktor-client-darwin:2.0.0")
+    implementation(libs.ktor.client.darwin)
 }
```

## Verification Results

### Manual Verification
> [!IMPORTANT]
> The app is now fully configured for both Android and iOS.
> 1. **Android**: Tested and working.
> 2. **iOS**: Koin dependency issues and Ktor version conflicts have been resolved.

- The dependency chain is now fully satisfied on all platforms.
- Network and Database dependencies are now using consistent versions across the project.
