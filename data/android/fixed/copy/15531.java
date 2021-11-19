public void selectTile(GameWindow window, Tile tile, int type) {
    window.setFirstClicked(tile);
    tile.isClicked = true;
    tile.setBorder(TileArea.SELECTED_BORDER);
}