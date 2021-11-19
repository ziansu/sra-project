@java.lang.Override
public void onDestroy() {
    if ((activePlayer) != null) {
        activePlayer.release();
    }
    super.onDestroy();
}