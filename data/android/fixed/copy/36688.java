public static stratos.game.maps.Tile approachTile(stratos.game.maps.Target aims, stratos.game.maps.Mobile client) {
    final stratos.game.maps.Boarding point = stratos.game.maps.PathSearch.approachPoint(aims, client, true);
    return point instanceof stratos.game.maps.Tile ? ((stratos.game.maps.Tile) (point)) : null;
}