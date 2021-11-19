public void paint(float alpha) {
    if ((gamePaused) == false) {
        foreGround.paint(alpha);
        backGround.paint(alpha);
        com.scgame.adozeneggs.core.SAHandler.getInstance().paint(alpha);
    }
}