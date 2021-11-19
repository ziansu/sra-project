@Test.Network.Test
public void agricolaShouldHaveComplexityBetween3And4() {
    double complexity;
    Main.Containers.Boardgame game = games.get(0);
    complexity = game.getComplexity();
    assertTrue(((complexity > 3.0) && (complexity < 4.0)));
}