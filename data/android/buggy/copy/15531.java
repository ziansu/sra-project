public void selectTile(GameWindow window, Tile tile, boolean type) {
    window.setFirstClicked(tile);
    tile.isClicked = true;
    window.setFirstClickedIsGrid(type);
    tile.setBorder(TileArea.SELECTED_BORDER);
}