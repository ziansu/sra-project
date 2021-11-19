@java.lang.Override
public void clickCell(minesweeper.Location c) {
    if (mineField.clickCell(c)) {
        gameLose();
    }else
        if (fieldIsClear()) {
            gameWin();
        }else {
            update();
        }
    
}