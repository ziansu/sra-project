static char toLower(char c) {
    if ((c >= 'A') && (c <= 'Z')) {
        return ((char) (c + (org.apache.coyote.http2.Hpack.LOWER_DIFF)));
    }
    return c;
}