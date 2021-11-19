@org.junit.Test
public void testDeckExists() {
    models.Deck deck = new models.Deck();
    org.junit.Assert.assertNotNull(deck);
}