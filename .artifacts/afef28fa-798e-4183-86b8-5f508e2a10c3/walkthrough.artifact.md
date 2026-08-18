# Walkthrough - Fixing `SerializationException`

I have applied the `kotlinx-serialization` compiler plugin to the project to resolve the `SerializationException: Serializer for class 'SearchPhotosResponse' is not found`.

## Changes

### Build Configuration

#### [libs.versions.toml](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/gradle/libs.versions.toml)
Added the `kotlinxSerialization` plugin definition.

#### [build.gradle.kts (root)](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/build.gradle.kts)
Added the plugin to the root build file to make it available for subprojects.

#### [app/shared/build.gradle.kts](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/app/shared/build.gradle.kts)
Applied the plugin to the `shared` module where the `@Serializable` classes are defined.

## Verification Results

### Automated Tests
- Triggered a Gradle Sync which finished successfully, confirming that the plugin is correctly resolved and applied.
- Attempted a build (`:app:shared:assemble`). While there are pre-existing compilation errors in the project (unrelated to serialization), the serialization plugin is now correctly configured.

> [!NOTE]
> The project currently has some pre-existing compilation errors in `AppColumn.kt` and `AppRow.kt` (invalid `android.*` imports in `commonMain`) and some `actual`/`expect` mismatches in `Platform.kt`. These should be addressed separately as they are unrelated to the serialization issue.
