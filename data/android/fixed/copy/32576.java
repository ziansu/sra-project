@java.lang.Override
public void dimensionsRead(int height, int width) {
    this.height = height;
    this.width = width;
    tiles = new ballmerpeak.stargate.tiles.Tile[height][width];
}