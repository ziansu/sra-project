public static java.util.ArrayList<Token> process(java.lang.String s) {
    int[][] delta = Tokenizer.initDelta();
    return Tokenizer.findAllTokens(s, delta);
}