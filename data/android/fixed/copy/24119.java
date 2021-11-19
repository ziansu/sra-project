@Test.Network.Test
public void hiveShouldHaveNumPlays1() {
    int numPlays;
    Main.Containers.Boardgame game = games.get(20);
    numPlays = game.getNumberOfPlays();
    assertEquals(1, numPlays);
}