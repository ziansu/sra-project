@java.lang.Override
public void deleteFolder(java.lang.String inCatalogId, org.openedit.Data inExisting) {
    java.lang.String type = inExisting.get("hotfoldertype");
    getFolderSearcher(inCatalogId).delete(inExisting, null);
    if (type == "syncthing") {
        updateSyncThingFolders(inCatalogId);
    }
}