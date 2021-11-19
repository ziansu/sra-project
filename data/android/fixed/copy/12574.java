private static java.lang.String removeEscapeCharacter(java.lang.String rawInput) {
    return rawInput.replaceAll(calendear.parser.Parser.PATTERN_ESCAPE_CHARACTER, calendear.parser.Parser.EMPTY);
}