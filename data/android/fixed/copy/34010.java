public static java.lang.String base64Encode(byte[] bytesToEncode) {
    if (bytesToEncode != null) {
        return com.smartdevicelink.trace.Mime.base64Encode(bytesToEncode, 0, bytesToEncode.length);
    }
    return null;
}