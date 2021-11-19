public void moveHorizontal(double delta) {
    _poCenter.setX(delta);
    getPoRight().move(delta, DEFAULT_VALUE);
    getPoLeft().move(delta, DEFAULT_VALUE);
}