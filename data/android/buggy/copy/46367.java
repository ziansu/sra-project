public static boolean checkFree(int x, int y, c2f.boatbusters.classes.WarShip[][] board) {
    return (board[(x - 1)][(y - 1)]) == null;
}