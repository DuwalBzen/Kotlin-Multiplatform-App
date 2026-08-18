# Fix `kotlinx.serialization.SerializationException`

The application is crashing because the `kotlinx-serialization` compiler plugin is not applied to the module containing `@Serializable` classes. This prevents the compiler from generating the necessary serializers.

## Proposed Changes

### [Component Name] Build Configuration

#### [MODIFY] [libs.versions.toml](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/gradle/libs.versions.toml)
- Add `kotlinxSerialization` plugin definition under `[plugins]`.
- (Optional but recommended) Add `kotlinx-serialization-json` under `[libraries]` if not already present (it's currently present as part of Ktor, which is fine, but direct usage of `@Serializable` often warrants the core library dependency).

#### [MODIFY] [build.gradle.kts (root)](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/build.gradle.kts)
- Add `alias(libs.plugins.kotlinxSerialization) apply false` to the `plugins` block.

#### [MODIFY] [app/shared/build.gradle.kts](file:///C:/Users/bijen duwal/AndroidStudioProjects/Kmpfirstapp/app/shared/build.gradle.kts)
- Add `alias(libs.plugins.kotlinxSerialization)` to the `plugins` block.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:shared:assemble` to ensure the project builds correctly with the plugin.
- If there are unit tests for data classes, run them.

### Manual Verification
- Deploy the app to a device/emulator and verify that the `SearchPhotosResponse` can be serialized/deserialized without throwing the `SerializationException`.
