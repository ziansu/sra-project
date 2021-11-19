public static java.nio.file.Path getPath(java.lang.String directory) {
    java.nio.file.Path path = java.nio.file.Paths.get(directory);
    if (!(java.nio.file.Files.isDirectory(path)))
        throw new java.lang.IllegalArgumentException("Not a directory");
    
    return path;
}