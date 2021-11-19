@java.lang.Override
public long getFileLength(java.lang.String id) {
    java.io.File f = resolveFile(id).toFile();
    try {
    } finally {
    }
    return resolveFile(id).toFile().length();
}