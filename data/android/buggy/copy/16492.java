public void reset(java.lang.String input) {
    this.input = input;
    android.util.Log.d("Lexer", ("input string is " + input));
    currentPos = 0;
    pushedBackTokens = new java.util.Stack<>();
}