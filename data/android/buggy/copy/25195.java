public java.lang.String create(java.io.File file) throws java.lang.Exception {
    java.lang.String id = synchronizer.upload(file);
    uploadManifestToAllAccounts();
    return id;
}