public com.example.josh.hiitcards.Card draw() {
    com.example.josh.hiitcards.Card drawn = deck.remove(0);
    if ((deck.size()) == 0) {
        populate(deck);
        shuffle(deck);
    }
    return drawn;
}