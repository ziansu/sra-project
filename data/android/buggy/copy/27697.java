@java.lang.Override
public java.io.File locateFile(java.lang.String relativePath) {
    return checkFileAccess(new java.io.File(de.deepamehta.plugins.proxy.ProxyPlugin.FILE_REPOSITORY_PATH, relativePath));
}