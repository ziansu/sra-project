public void importKey(java.io.InputStream key) throws java.io.IOException {
    byte[] keybytes = org.apache.commons.io.IOUtils.toByteArray(key);
    if (haveKey(getFingerPrint(keybytes))) {
        return ;
    }
    runGPG(java.util.Arrays.asList("--import"), keybytes);
}