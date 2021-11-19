public void clearPersistedFiles(java.util.List<java.lang.Long> persistedFiles) {
    synchronized(mPersistedFiles) {
        mPersistedFiles.removeAll(persistedFiles);
    }
}