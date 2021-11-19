protected void removeStones(myPackage.GemsMatch match) {
    for (myPackage.Coordinates c : match.coords) {
        board[c.x][c.y] = myPackage.Utils.MAP_GEM.EMPTY;
    }
}