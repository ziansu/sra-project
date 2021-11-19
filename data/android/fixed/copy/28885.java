public void writeToDefaultFile(tailminuseff.config.Configuration c) throws java.io.FileNotFoundException, java.io.IOException {
    try (java.io.FileOutputStream fos = new java.io.FileOutputStream(this.file)) {
        write(fos, c);
    }
}