public void exit() {
    status = models.Game.GameStatus.已结束;
    this.save();
}