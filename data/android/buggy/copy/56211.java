public boolean tryArchive() {
    try {
        java.io.File archiveDir = getArchiveStorageDir();
        tryWriteToFile(archiveDir);
    } catch (java.lang.Exception ex) {
        this.error = ex.getMessage();
        return false;
    }
    return true;
}