static java.lang.String encodeString(java.lang.String s) {
    return "0x" + (org.spongycastle.util.encoders.Hex.toHexString(s.getBytes()));
}