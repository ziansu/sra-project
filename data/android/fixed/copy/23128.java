private static java.lang.String formatMessage(final java.lang.String s) {
    if (s == null) {
        return "";
    }
    return s.replaceAll("\n", "<:LF:>");
}