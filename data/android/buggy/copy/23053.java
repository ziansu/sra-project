private void jump() throws CIT260.crashInTheCaribbean.exceptions.HowToMoveException {
    CIT260.crashInTheCaribbean.control.MoveControl controlMove = new CIT260.crashInTheCaribbean.control.MoveControl();
    int movPlayer = controlMove.controlMove(J, boost);
    throw new CIT260.crashInTheCaribbean.exceptions.HowToMoveException("You just jumped");
}