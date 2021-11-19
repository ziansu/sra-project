private static java.lang.String removeEscapeCharacter(java.lang.String rawInput) {
    java.lang.System.out.println(rawInput);
    java.lang.System.out.println(rawInput.replaceAll(calendear.parser.Parser.PATTERN_ESCAPE_CHARACTER, calendear.parser.Parser.EMPTY));
    return rawInput.replaceAll(calendear.parser.Parser.PATTERN_ESCAPE_CHARACTER, calendear.parser.Parser.EMPTY);
}