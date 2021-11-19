private static java.lang.String readLine(java.lang.String filename) throws java.io.IOException {
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filename), 256)) {
        return reader.readLine();
    }
}