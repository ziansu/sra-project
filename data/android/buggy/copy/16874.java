@Test.Network.Test
public void agricolaShouldHaveMaxPlaytime150Min() {
    int maxPlaytime = 0;
    Main.Containers.Boardgame game = games.get(0);
    maxPlaytime = game.getMaxPlaytime();
    assertEquals(150, maxPlaytime);
}