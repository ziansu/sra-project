public void updateBattleField(group5.battleship.src.logic.Cordinate c, int state) {
    int x = c.x;
    int y = c.y;
    battleField[x][y] = state;
}