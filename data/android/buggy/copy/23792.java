private static java.lang.String removeSubstring(java.lang.String from, java.lang.String substring) {
    java.lang.String firstReplace = from.replaceFirst(substring, "");
    java.lang.String secondReplace = firstReplace.replaceFirst("  ", " ");
    return secondReplace;
}