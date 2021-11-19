public static java.lang.String trimEnd(java.lang.String s) {
    if (s != null) {
        s.replaceAll("\\s+\\z", "");
    }
    return null;
}