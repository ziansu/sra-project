public void displayDisc(int card, gameEntities.Deck discard) {
    discard.putInto(display.get(card));
    display.remove(card);
}