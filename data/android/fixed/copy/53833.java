private static java.lang.String replaceLast(java.lang.String text, java.lang.String regex, java.lang.String replacement) {
    return text.replaceFirst((((("(?s)" + regex) + "(?!.*?") + regex) + ")"), replacement);
}