public org.gearvrf.scene_objects.GVRModelSceneObject loadModel(java.lang.String assetFile, java.util.EnumSet<org.gearvrf.GVRImportSettings> settings) throws java.io.IOException {
    return mImporter.loadModel(assetFile, GVRResourceVolume.VolumeType.ANDROID_ASSETS, settings, true, null);
}