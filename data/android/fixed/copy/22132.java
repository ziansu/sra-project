@java.lang.Override
public void run() {
    com.nordman.big.life.GridView theGrid = mGridView.get();
    if ((theGrid.currentMode) == (com.nordman.big.life.GridView.RUNNING)) {
        theGrid.update();
        theGrid.invalidate();
    }
}