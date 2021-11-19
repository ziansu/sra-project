private void checkLine() {
    if ((peekIndex) >= (currentLine.length())) {
        getCurrentLine();
    }
}