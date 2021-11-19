public void changeDeckType(final org.dasfoo.delern.models.Deck deck, final org.dasfoo.delern.models.DeckType deckType) {
    deck.setDeckType(deckType.name());
    deck.save(null);
}