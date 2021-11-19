private boolean isInside(java.lang.String path, java.lang.String folder) {
    return "".equals(path) ? false : path.startsWith(folder);
}