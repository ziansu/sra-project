@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    timer.cancel();
    com.jchingdev.squares.singleplayer.Chartboost.onDestroy(this);
}