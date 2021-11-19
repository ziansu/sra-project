public static filter.FilterExpression parse(java.lang.String input) {
    if (input.isEmpty()) {
        return Qualifier.EMPTY;
    }
    return new filter.Parser(new filter.lexer.Lexer(input).lex(), false).parseExpression(0);
}