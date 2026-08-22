# Fix Compilation Errors in `app:shared`

The project has several compilation errors in the `shared` module:
1. `AppColumn.kt` and `AppRow.kt` in `commonMain` have incorrect package names and are importing Android-specific classes. (Fixed)
2. Incorrect `actual class Platform` implementations in `appleMain` and `nativeMain`. (Fixed by commenting out)
3. `ImageItem.kt` was incorrectly marked with `@Serializer` instead of `@Serializable`. (Fixed)
4. `HomeViewModel.kt` has a type mismatch in `searchImages` where it tries to assign a `List<UnsplashPhotoDto>` (extracted from `SearchPhotosResponse`) to a `MutableStateFlow<RequestState<List<ImageItem>>>`.

## Proposed Changes

### [Component Name] View Model

#### [MODIFY] [HomeViewModel.kt](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/app/shared/src/commonMain/kotlin/com/example/kmpfirstapp/screen/home/HomeViewModel.kt)
- Fix the `searchImages` function to correctly map `UnsplashPhotoDto` to `ImageItem` and wrap the result in `RequestState.Success`.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:shared:assemble` to verify that the `shared` module compiles successfully.
