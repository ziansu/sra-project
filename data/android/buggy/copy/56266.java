public void getNextChar() {
    try {
        prevChar = currChar;
        currChar = charStream.currentChar();
    } catch (LexicalAnalyzer.LexicalError ex) {
        ex.printStackTrace(java.lang.System.out);
    }
}