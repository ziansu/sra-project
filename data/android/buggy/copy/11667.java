private void processStorage() {
    if ((isStorageExist(getFileRelativePath())) == false) {
        createStorage(getFileRelativePath());
    }
}