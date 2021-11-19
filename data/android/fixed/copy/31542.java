public int getPlayerRightX() {
    return ((getPlayerX()) + (getHalfPlayerWidth())) - (map.getX());
}