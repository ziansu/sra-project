@java.lang.Override
public void onPlayerRegistered(se.cygni.snake.api.response.PlayerRegistered playerRegistered) {
    se.cygni.snake.ExampleSnakePlayer.log.info(("PlayerRegistered: " + playerRegistered));
    startGame();
}