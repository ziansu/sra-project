public static filter.FilterExpression parse(java.lang.String input) {
    if ((input == null) || (input.isEmpty()))
        return Qualifier.EMPTY;
    
    return new filter.Parser(new filter.lexer.Lexer(input).lex()).parseExpression(0);
}