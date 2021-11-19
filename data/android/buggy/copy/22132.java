@java.lang.Override
public void run() {
    com.nordman.big.life.GridView theGrid = mGridView.get();
    android.util.Log.d("LOG", "...handle message...");
    if ((theGrid.currentMode) == (com.nordman.big.life.GridView.RUNNING)) {
        theGrid.update();
        theGrid.invalidate();
    }
}