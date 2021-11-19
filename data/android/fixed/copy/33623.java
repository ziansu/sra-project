public void errorOnWord() {
    words.get(cursorWord).newFault();
    stats.incrementError();
}