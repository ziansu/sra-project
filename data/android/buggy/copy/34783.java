@java.lang.Override
public void onClick(android.view.View v) {
    if (mp.isPlaying())
        mp.stop();
    
    finish();
}