@org.junit.Test
public void testDeckGetCardsRemaining() {
    models.Deck deck = new models.Deck();
    assertEquals(52, deck.getCardsRemaining());
}