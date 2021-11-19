public int getPlayerLeftX() {
    return (((getPlayerX()) - (getHalfPlayerWidth())) - (map.getX())) - 1;
}