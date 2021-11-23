private org.cryptomator.webdav.jackrabbit.NonExistingNode createNonExisting(org.apache.jackrabbit.webdav.DavResourceLocator locator, org.apache.jackrabbit.webdav.DavSession session) {
    return new org.cryptomator.webdav.jackrabbit.NonExistingNode(this, locator, session, lockManager, cryptor);
}