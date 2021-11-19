private void setup() {
    this.levelTimer = new com.mygdx.game.sprites.Timer();
    com.mygdx.game.managment.FrogManager.getInstance().reset();
    setLevelsToAddFrog();
    setCurrentLevel();
}