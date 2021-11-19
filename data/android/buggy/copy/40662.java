@org.junit.Test
public void testDrawCard() {
    models.Deck deck = new models.Deck();
    models.Card card = deck.drawCard();
    java.lang.System.out.print(card.getValue());
}