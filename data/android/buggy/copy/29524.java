private boolean getGameOver() {
    if (panda.isHit()) {
        if (newHighScore()) {
            prefs.setHighScore(panda.getUserModel().getScore());
        }
        return true;
    }
    return false;
}