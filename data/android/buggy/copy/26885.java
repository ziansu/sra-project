private void advanceLexerSkippingWhitespaces() {
    java.lang.System.out.println("advance skipping ws");
    do {
        advanceLexer();
    } while ((atToken(com.maddyhome.idea.vim.lang.parser.WHITESPACE)) && (!(builder.eof())) );
}