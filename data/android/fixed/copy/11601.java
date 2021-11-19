@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((timer) != null)
        timer.cancel();
    
    com.jchingdev.squares.singleplayer.Chartboost.onDestroy(this);
}