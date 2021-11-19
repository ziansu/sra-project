public void playCard(Model.Card card) {
    table.playCard(card, this);
    hand.remove(card);
}