private org.cryptomator.webdav.jackrabbit.NonExistingNode createNonExisting(org.apache.jackrabbit.webdav.DavResourceLocator locator, org.apache.jackrabbit.webdav.DavSession session, java.nio.file.Path filePath, java.nio.file.Path dirFilePath) {
    return new org.cryptomator.webdav.jackrabbit.NonExistingNode(this, locator, session, lockManager, cryptor, filePath, dirFilePath);
}