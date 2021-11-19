private java.lang.String selectNumberSubpath(java.lang.String path) {
    java.lang.String subpath = path.substring(((path.lastIndexOf('.')) - 4), path.lastIndexOf('.'));
    return subpath;
}