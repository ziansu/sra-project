public void showTileWhereClicked(int screenX, int screenY) {
    com.badlogic.gdx.scenes.scene2d.ui.Image tile = findTile(screenX, screenY);
    if (tile != null) {
        tile.setVisible(true);
    }
}