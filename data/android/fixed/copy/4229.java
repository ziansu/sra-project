@org.junit.Test
public void testGetScore() {
    final int num = 30;
    gamelogic.Board board = new gamelogic.Board();
    board.setScore(num);
    org.junit.Assert.assertTrue(((board.getScore()) == num));
}