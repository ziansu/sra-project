public static void useUndo(woohoo.utils.framework.UndoState undo) {
    woohoo.utils.gameobjects.TileMap.tileList = undo.state;
    woohoo.utils.gameobjects.TileMap.mapWidth = undo.width;
    woohoo.utils.gameobjects.TileMap.mapHeight = undo.height;
}