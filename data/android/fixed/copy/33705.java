@java.lang.Override
public void run() {
    android.util.Log.d("BoardUpdater", "Displaying board");
    android.util.Log.d("BoardUpdater", myBoard.toString());
    activity.displayBoard(myBoard);
}