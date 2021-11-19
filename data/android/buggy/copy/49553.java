protected boolean checkForCollision() {
    collisionModel.setX(pos.getX());
    collisionModel.setY(pos.getY());
    return false;
}