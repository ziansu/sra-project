public void setPowerUpType(de.bricked.game.powerups.PowerUpType powerUpType) {
    this.powerUpType = powerUpType;
    setText(((this.brickType.getID()) + (this.powerUpType.getID())));
}