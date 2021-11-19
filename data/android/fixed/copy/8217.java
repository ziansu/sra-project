public static boolean isLegalDirectiveChar(char c) {
    return (me.haved.daf.lexer.text.TextParserUtil.isIdentifierChar(c)) || (c == '(');
}