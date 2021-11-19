public name.sukhoykin.pong.game.Vector multiply(double scalar) {
    if ((multiply) == null) {
        multiply = new name.sukhoykin.pong.game.Vector();
    }
    multiply.x = (x) * scalar;
    multiply.y = (y) * scalar;
    return multiply;
}