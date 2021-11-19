public static void setGame(com.kry.brickgame.games.Game game) {
    com.kry.brickgame.Main.game = game;
    java.lang.System.gc();
    if (null == (com.kry.brickgame.Main.gameThread)) {
        com.kry.brickgame.Main.gameThread = java.util.concurrent.Executors.newSingleThreadExecutor();
    }
    com.kry.brickgame.Main.gameThread.execute(game);
}