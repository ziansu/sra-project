public java.util.List<org.robolectric.manifest.ServiceData> getServices() {
    parseAndroidManifest();
    return new java.util.ArrayList(serviceDatas.values());
}