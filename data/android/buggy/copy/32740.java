@java.lang.Override
public void changeDeckType(final int position, final org.dasfoo.delern.models.DeckType deckType) {
    org.dasfoo.delern.models.Deck deck = getDeckFromAdapter(position);
    deck.setDeckType(deckType.name());
    deck.save(null);
}