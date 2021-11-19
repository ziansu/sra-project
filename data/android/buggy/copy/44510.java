@jdk.nashorn.internal.ir.annotations.Ignore
public void testTennisGame_Start() {
    TennisGame game = new TennisGame();
    java.lang.String score = game.getScore();
    assertEquals("Initial score incorrect", "love - love", score);
}