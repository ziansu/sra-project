public T invalidate(java.lang.String url) {
    java.io.File file = getCachedFile(url);
    file.delete();
    return self();
}