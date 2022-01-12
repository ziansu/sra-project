@Test.Network.Test
public void agricolaShouldHaveNumPlays0() {
    int numPlays;
    Main.Containers.Boardgame game = games.get(0);
    numPlays = game.getNumberOfPlays();
    assertEquals(0, numPlays);
}