public java.lang.String getLocalTempDir() {
    java.lang.String path = properties.getString("temp-folder", null);
    if (path != null) {
        path = replaceFolderVariable(path);
    }
    return path;
}