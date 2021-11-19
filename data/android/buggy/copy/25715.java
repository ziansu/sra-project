public static seventh.map.Tile.SurfaceType fromId(int id) {
    if ((id < 0) || (id >= (seventh.map.Tile.SurfaceType.values().length))) {
        return seventh.map.Tile.SurfaceType.UNKNOWN;
    }
    return seventh.map.Tile.SurfaceType.values()[id];
}