@java.lang.Override
public long getFileLength(java.lang.String id) {
    return resolveFile(id).toFile().length();
}