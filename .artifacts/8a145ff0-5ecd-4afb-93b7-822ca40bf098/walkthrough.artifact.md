# Walkthrough - Fixed KanjiViewModel Injection

I have fixed the `InstanceCreationException` occurring when the app tried to create an instance of `KanjiViewModel`.

## Changes

### DI Configuration

#### [KoinModule.kt](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/app/shared/src/commonMain/kotlin/com/example/kmpfirstapp/di/KoinModule.kt)

I updated the `initializeKoin` function to include the `platformModule`. This module contains the platform-specific `AppDatabase` definition (using Room), which is a required dependency for the `KanjiDao` and subsequently the `KanjiRepository` and `KanjiViewModel`.

```diff
     startKoin {
         config()
-        modules(koinModule, networkModule, databaseModule)
+        modules(koinModule, networkModule, databaseModule, platformModule)
     }
```

## Verification Results

### Manual Verification
> [!IMPORTANT]
> Please run the application on your device or emulator. The `KanjiViewModel` should now be correctly instantiated, and the Kanji screen should load without crashing.

- The dependency chain is now fully satisfied:
    - `KanjiViewModel` -> `KanjiRepository` (in `databaseModule`)
    - `KanjiRepository` -> `KanjiDao` (in `databaseModule`)
    - `KanjiDao` -> `AppDatabase` (in `platformModule` - **FIXED**)
