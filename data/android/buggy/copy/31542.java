public int getPlayerRightX() {
    return (((getPlayerX()) + (getHalfPlayerWidth())) + 1) - (map.getX());
}