private void advanceUntilNewLine() {
    java.lang.System.out.println("advance until nl");
    do {
        advanceLexer();
    } while ((!(atToken(com.maddyhome.idea.vim.lang.parser.NEW_LINE))) && (!(builder.eof())) );
}