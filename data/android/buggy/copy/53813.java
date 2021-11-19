@java.lang.Override
protected boolean doDelete(java.lang.String name) throws java.io.IOException {
    cachedNames.remove(name);
    return java.nio.file.Files.deleteIfExists(resolvePath(name));
}