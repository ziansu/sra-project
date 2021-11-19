void install(java.io.File outClassFile) throws java.io.IOException {
    addSDE();
    try (java.io.FileOutputStream outStream = new java.io.FileOutputStream(outClassFile)) {
        outStream.write(gen, 0, genPos);
    }
}