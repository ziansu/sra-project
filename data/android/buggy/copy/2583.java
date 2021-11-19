public void drawCard() {
    try {
        hand.addCard(deck.draw());
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("No more cards");
    }
}