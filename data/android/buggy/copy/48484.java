protected boolean onUndo(android.view.View view) {
    com.google.engedu.wordstack.LetterTile tile = placedTiles.pop();
    tile.moveToViewGroup(stackedLayout);
    return true;
}