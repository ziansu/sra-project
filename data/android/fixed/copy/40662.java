@org.junit.Test
public void testDrawCard() {
    models.Deck deck = new models.Deck();
    models.Card card = deck.drawCard();
    assertNotNull(card);
}