public void importKey(byte[] key) throws java.io.IOException {
    if (haveKey(getFingerPrint(key))) {
        return ;
    }
    runGPG(java.util.Arrays.asList("--import"), key);
}