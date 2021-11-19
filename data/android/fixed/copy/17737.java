private java.io.File createFolderIfNotExisting(final java.io.File folder) {
    if (!(folder.exists())) {
        folder.mkdir();
    }
    return folder;
}