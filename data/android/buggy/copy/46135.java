protected static void newGame() {
    java.util.Timer timer = new java.util.Timer();
    boydjohnson.GameClock clockTick = new boydjohnson.GameClock(boydjohnson.SnakeGame.snake, boydjohnson.SnakeGame.kibble, boydjohnson.SnakeGame.score, boydjohnson.SnakeGame.snakePanel);
    timer.scheduleAtFixedRate(clockTick, 0, boydjohnson.SnakeGame.clockInterval);
}