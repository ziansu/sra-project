public void isDeckEmpty() {
    boolean value = deckArray.isEmpty();
    if (value) {
        deckArray.addAll(discardArray);
        discardArray.clear();
        shuffleDeck();
    }
}