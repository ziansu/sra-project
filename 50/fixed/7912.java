@org.junit.Test
public void testSnakeDestruction() {
    game.executeCommand(new GameCommands.ChangeSnakeVelocityCommand(Utils.VelocityVector.down));
    game.update();
    game.update();
    assertTrue(game.snake.getIsDestructed());
}