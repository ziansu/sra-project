private java.io.Reader getFileReaderForPath(java.lang.String path) throws java.io.FileNotFoundException {
    java.io.Reader reader = null;
    try {
        reader = new java.io.FileReader(path);
    } catch (java.io.FileNotFoundException e) {
        throw new java.io.FileNotFoundException(("Input CSV file not found: " + path));
    }
    return reader;
}