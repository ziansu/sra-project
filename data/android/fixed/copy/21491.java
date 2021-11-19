public void setOffsets(int mapX, int mapY) {
    this.mapX = mapX;
    this.mapY = mapY;
    maxOffsetX = mapX - (indigo.Main.Game.WIDTH);
    maxOffsetY = mapY - (indigo.Main.Game.HEIGHT);
    minOffsetX = 0;
    minOffsetY = 0;
}