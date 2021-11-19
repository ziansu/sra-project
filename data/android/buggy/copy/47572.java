private static int getLastInstalledVersion(android.content.Context context) {
    if (mini.app.orbis.VersionManager.initialized)
        return mini.app.orbis.VersionManager.previouslyInstalledVersions[((mini.app.orbis.VersionManager.previouslyInstalledVersions.length) - 1)];
    
    return -1;
}