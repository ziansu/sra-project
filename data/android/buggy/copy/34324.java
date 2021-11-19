@java.lang.Override
public ca.liqwidice.mirrors.level.tile.Tile copy() {
    return new ca.liqwidice.mirrors.level.tile.PointerTile(x, y, direction.encode(), colour, level);
}