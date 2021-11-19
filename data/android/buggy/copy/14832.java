public int getCurrentVelocity() {
    if (game.useVectorMove()) {
        return getVelocity();
    }
    return currentVelocity;
}