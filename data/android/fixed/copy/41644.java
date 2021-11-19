private void placeStairs() {
    com.darkxell.common.dungeon.floor.Room exitRoom = this.randomRoom();
    exitRoom.randomTile(this.random).setType(TileType.STAIR);
}