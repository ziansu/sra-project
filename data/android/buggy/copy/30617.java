private static java.lang.String readLine(java.lang.String filename) throws java.io.IOException {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filename), 256);
    try {
        return reader.readLine();
    } finally {
        reader.close();
    }
}