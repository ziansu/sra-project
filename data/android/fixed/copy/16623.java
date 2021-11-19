public static java.lang.String sha1BytesToHex(byte[] bytes) {
    synchronized(com.bumptech.glide.util.Util.SHA_1_CHARS) {
        return com.bumptech.glide.util.Util.bytesToHex(bytes, com.bumptech.glide.util.Util.SHA_1_CHARS);
    }
}