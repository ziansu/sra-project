public static byte[] stringToByte(java.lang.String data, int flag) {
    return android.util.Base64.decode(data, ((android.util.Base64.NO_PADDING) | (android.util.Base64.NO_WRAP)));
}