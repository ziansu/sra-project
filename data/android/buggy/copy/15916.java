@java.lang.Override
protected void drawSpecial(android.graphics.Canvas canvas, int offset) {
    for (com.gmail.wazappdotgithub.ships.model.IShip s : board.arrayOfShips()) {
        drawShip(canvas, offset, s);
    }
}