@org.junit.Test
public void testGameBuildDeck() {
    models.Game g = new models.Game();
    g.buildDeck();
    assertEquals(52, g.deck.size());
}