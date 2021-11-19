private java.lang.String getFiles(java.lang.String filename, java.lang.String directory) {
    java.lang.String dir = (directory != null) ? directory : ".";
    return atos(findFiles(filename, dir));
}