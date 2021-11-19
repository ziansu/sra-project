public org.apollo.game.model.Position add(int deltaX, int deltaY, int deltaZ) {
    return new org.apollo.game.model.Position(((getX()) + deltaX), ((getY()) + deltaY), ((getHeight()) + deltaZ));
}