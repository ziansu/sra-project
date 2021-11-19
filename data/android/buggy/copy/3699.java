private java.lang.String curDir(java.lang.String directory) {
    java.io.File folder = new java.io.File(directory);
    java.io.File f = new java.io.File("");
    return f.getAbsolutePath();
}