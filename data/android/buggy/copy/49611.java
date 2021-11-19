private boolean isFile(java.lang.String filePath) {
    java.io.File f = new java.io.File(filePath);
    return (f.exists()) && (!(f.isDirectory()));
}