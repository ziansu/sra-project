private static int getPatternCompileFlags(java.lang.String regex) {
    for (char c : regex.toCharArray()) {
        if (java.lang.Character.isUpperCase(c)) {
            return 0;
        }
    }
    return java.util.regex.Pattern.CASE_INSENSITIVE;
}