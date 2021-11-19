public void playCard(Model.Card card) {
    hand.remove(card);
    table.playCard(card, this);
}