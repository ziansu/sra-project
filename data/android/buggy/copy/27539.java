private void right() throws CIT260.crashInTheCaribbean.exceptions.HowToMoveException {
    CIT260.crashInTheCaribbean.control.MoveControl controlMove = new CIT260.crashInTheCaribbean.control.MoveControl();
    int movPlayer = controlMove.controlMove(R, boost);
    throw new CIT260.crashInTheCaribbean.exceptions.HowToMoveException((("You moved to the right " + movPlayer) + " places"));
}