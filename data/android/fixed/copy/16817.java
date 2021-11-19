protected void resetLevel(boolean loseLife) {
    if (loseLife) {
        com.teamf_bw.ist402.tiltnroll.GameController.getInstance().loseALife();
        startTime = java.lang.System.currentTimeMillis();
    }
    level.resetLevel();
}