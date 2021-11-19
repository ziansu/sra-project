com.github.codechapin.postcss.tokenizer.TokenizerException unclosed(final java.lang.String what) {
    return new com.github.codechapin.postcss.tokenizer.TokenizerException(("Unclosed " + what), startLine, startColumn, line, column);
}