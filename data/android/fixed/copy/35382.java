public java.lang.String modify(java.io.File file) throws java.lang.Exception {
    java.lang.String id = synchronizer.update(file);
    if (id != null) {
        uploadManifestToAllAccounts();
    }
    return id;
}