public java.lang.String getLastPath() {
    return ((java.lang.String) (preferences.get("last-path", com.ray3k.skincomposer.data.ProjectData.generalPref.getString("last-path", Gdx.files.getLocalStoragePath()))));
}