public void discardAll(java.util.ArrayList<game.cards.AbstractCard> cards) {
    for (game.cards.AbstractCard card : cards) {
        this.discardCard(card);
    }
}