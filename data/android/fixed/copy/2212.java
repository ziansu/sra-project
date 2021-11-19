private java.lang.String extractNextWord() {
    int saveCurrentCaret = currentCaret;
    moveCaretToNextSpace();
    int newCurrentCaret = currentCaret;
    currentCaret = saveCurrentCaret;
    return readingText.substring(currentCaret, newCurrentCaret).trim();
}