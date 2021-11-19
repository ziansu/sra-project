private java.lang.String fixSearchString(java.lang.String s) {
    int start = s.indexOf("[");
    return s.substring(0, start);
}