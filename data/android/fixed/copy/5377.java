public void showTileWhereClicked(float x, float y) {
    com.badlogic.gdx.scenes.scene2d.ui.Image tile = findTile(x, y);
    if (tile != null) {
        tile.setVisible(true);
    }
}