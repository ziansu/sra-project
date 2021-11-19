private void columnBtn(int column) {
    com.llamaniac.not4.avoid4.RobotActivity.game.add(column);
    updatePlayer();
    if (!(updateGrid())) {
        robotTurn();
    }
}