@java.lang.Override
public void addCards(java.util.List<klondike.model.Card> cards) {
    for (klondike.model.Card card : cards) {
        assert card.isFlippedUp();
    }
    super.addCards(cards);
    super.setVisibleCards(klondike.model.Waste.MAX_VISIBLE_CARDS);
}