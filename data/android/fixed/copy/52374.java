@java.lang.Override
public void onClick(android.view.View v) {
    if (mPlaying)
        pause(playButton);
    else
        play();
    
}