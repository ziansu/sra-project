public boolean isMoveValid(int move) {
    Position desiredPos = positionType(move);
    return desiredPos == (Position.EMPTY);
}