public void clear() {
    HangulBuffer.clear();
    rawChar.clear();
    Syllables.clear();
    wordValid = true;
    clearComp();
}