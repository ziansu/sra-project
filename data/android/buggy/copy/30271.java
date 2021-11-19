public static java.lang.String[] toKeywords(java.lang.String pattern) {
    return pattern.split("\\P{L}+");
}