public java.lang.String getLastImportExportPath() {
    return ((java.lang.String) (preferences.get("last-import-export-path", com.ray3k.skincomposer.data.ProjectData.generalPref.getString("last-import-export-path", com.ray3k.skincomposer.data.ProjectData.generalPref.getString("last-path", Gdx.files.getLocalStoragePath())))));
}