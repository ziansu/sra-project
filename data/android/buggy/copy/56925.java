@org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
public final void testgetSelectedCoordsToBig() {
    gamelogic.Game game = new gamelogic.Game();
    game.start();
    final int int1 = 9;
    game.processClick(int1, 0);
    game.stop();
}