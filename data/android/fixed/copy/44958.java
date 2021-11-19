public static byte[] stringToByte(java.lang.String data, int flag) {
    return android.util.Base64.decode(data, flag);
}