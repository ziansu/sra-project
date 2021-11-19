public com.example.josh.hiitcards.Card draw() {
    com.example.josh.hiitcards.Card drawn = deck.remove(0);
    if ((deck.get(0)) == null) {
        populate(deck);
        shuffle(deck);
    }
    return drawn;
}