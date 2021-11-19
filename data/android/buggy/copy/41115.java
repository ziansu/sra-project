public static void readIntoFromDefaultFile(tailminuseff.config.Configuration c) throws java.io.FileNotFoundException, java.io.IOException, java.lang.ClassNotFoundException {
    try (java.io.FileInputStream fin = new java.io.FileInputStream(new java.io.File(java.lang.System.getProperty("user.home"), tailminuseff.config.ConfigurationIO.DEFAULT_FILE))) {
        tailminuseff.config.ConfigurationIO.readInto(fin, c);
    }
}