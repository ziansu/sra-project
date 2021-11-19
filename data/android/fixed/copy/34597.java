public void discardAll(java.util.ArrayList<game.cards.AbstractCard> cards) {
    for (game.cards.AbstractCard card : cards) {
        this.discardCard(card);
        java.lang.System.out.println(card.getName());
    }
}