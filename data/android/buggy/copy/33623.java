public void errorOnWord() {
    words.get(cursorWord).newFault();
    stats.incrementError();
    stats.editStreaks(words.get(cursorWord).faultWord());
}