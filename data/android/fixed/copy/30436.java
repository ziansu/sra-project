public void importKey(java.io.File file) throws java.io.IOException {
    runGPG("--import", file.getAbsolutePath());
}