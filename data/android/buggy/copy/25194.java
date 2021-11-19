@java.lang.Override
public bomberman.gameplay.GameMap clone() {
    return new bomberman.gameplay.GameMap(this.name, this.thumbnailKey, this.tiles.clone(), this.startPositions);
}