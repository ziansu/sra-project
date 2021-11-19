public boolean isLocalRepoHttpsEnabled() {
    return preferences.getBoolean(org.fdroid.fdroid.Preferences.PREF_LOCAL_REPO_HTTPS, org.fdroid.fdroid.Preferences.DEFAULT_LOCAL_REPO_HTTPS);
}