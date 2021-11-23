public void add(kr.iamghost.kurum.AppConfigFileEntry fileEntry) {
    add(new java.io.File(fileEntry.getOriginalPath()), fileEntry.getDropboxPath(), fileEntry.getExcludeList());
}