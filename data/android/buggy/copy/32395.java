public void act() {
    CheckScore.gameOver.playLoop();
    CheckScore.gameOver.setVolume(70);
    if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new CheckScoreScreen());
    }
}