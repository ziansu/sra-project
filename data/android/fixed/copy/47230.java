public static java.lang.String trimEnd(java.lang.String s) {
    if (s != null) {
        return s.replaceAll("\\s+\\z", "");
    }
    return null;
}