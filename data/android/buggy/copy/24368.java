public java.lang.String getMd5Hash() {
    try {
        return com.google.common.io.Files.hash(file(this), com.google.common.hash.Hashing.md5()).toString();
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}