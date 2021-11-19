public void importKey(java.io.File file) throws java.io.IOException {
    if (haveKey(getFingerPrint(file))) {
        return ;
    }
    runGPG("--import", file.getAbsolutePath());
}