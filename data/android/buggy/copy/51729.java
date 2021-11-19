static byte toLower(byte b) {
    if ((b >= 'A') && (b <= 'Z')) {
        return ((byte) (b + (org.apache.coyote.http2.Hpack.LOWER_DIFF)));
    }
    return b;
}