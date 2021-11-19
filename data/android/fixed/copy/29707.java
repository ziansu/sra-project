@java.lang.Override
public void onPlayPause() {
    if ((view) == null)
        return ;
    
    if (paused) {
        onResume();
        paused = false;
    }else {
        onPause();
        paused = true;
    }
}