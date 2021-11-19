private static void updateSharedPreferences() {
    android.content.SharedPreferences.Editor editor = org.redcross.openmapkit.OSMMapBuilder.sharedPreferences.edit();
    editor.putStringSet(org.redcross.openmapkit.OSMMapBuilder.PERSISTED_OSM_FILES, org.redcross.openmapkit.OSMMapBuilder.persistedOSMFiles);
    editor.apply();
}