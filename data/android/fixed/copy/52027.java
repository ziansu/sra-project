private void preTickMove() {
    brownshome.scriptwars.game.tanks.Coordinates newCoord = direction.move(position);
    if (world.isWall(newCoord)) {
        clearAction();
        return ;
    }
    shouldRenderMove = true;
    position = newCoord;
}