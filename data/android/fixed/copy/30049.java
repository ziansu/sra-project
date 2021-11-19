private static boolean equiv(java.lang.String r, java.lang.String s) {
    return r.regionMatches(true, 0, s, 0, s.length());
}