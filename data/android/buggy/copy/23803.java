public void goToJailAction(GoToJail square, Landable[][] board) {
    setSquareOn(new int[]{ 0 , 10 }, board);
    square.processVictim(this, board);
}