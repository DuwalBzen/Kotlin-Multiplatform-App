# Fix Koin InstanceCreationException for KanjiViewModel

The `KanjiViewModel` fails to be created because its dependency chain leads to `AppDatabase`, which is registered in `platformModule`. However, `platformModule` is currently not included in the Koin module list during initialization.

## Proposed Changes

### DI Configuration

#### [MODIFY] [KoinModule.kt](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/app/shared/src/commonMain/kotlin/com/example/kmpfirstapp/di/KoinModule.kt)
- Add `platformModule` to the `modules()` call in the `initializeKoin` function. This ensures that platform-specific implementations (like the Room database for Android and iOS) are available to Koin.

## Verification Plan

### Manual Verification
- Deploy the application to an Android device/emulator.
- Navigate to the Kanji screen (where `KanjiViewModel` is used).
- Verify that the app no longer crashes with `InstanceCreationException`.
- Verify that the Kanji list is displayed (seeding fake data should happen in `KanjiViewModel.init`).
