public static java.util.HashMap<java.lang.String, java.lang.String> getFilesFromGameFolder(java.lang.String pathToGameFolder) {
    java.io.File gameFolder = new java.io.File(pathToGameFolder);
    return ddejonge.ggp.tools.GameParser.parseMetaData(gameFolder);
}