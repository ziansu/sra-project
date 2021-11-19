@org.junit.Test
public void shouldHave40Squares() {
    com.monopoly.MonopolyGame game = new com.monopoly.MonopolyGame(4);
    java.util.List<com.monopoly.Square> squares = game.getSquares();
    assertEquals(40, squares.size());
}