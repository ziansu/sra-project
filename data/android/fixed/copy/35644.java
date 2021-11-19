public com.dotmarketing.viewtools.navigation.NavResult getNav(java.lang.String path, long languageId) throws com.dotmarketing.exception.DotDataException, com.dotmarketing.exception.DotSecurityException {
    com.dotmarketing.beans.Host host = getHostFromPath(path);
    if (host == null)
        host = currenthost;
    
    return getNav(host, path, languageId);
}