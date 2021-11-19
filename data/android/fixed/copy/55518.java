public static boolean isLatex(java.lang.String string) {
    return (((string.length()) >= 2) && (string.endsWith("$"))) && (string.startsWith("$"));
}