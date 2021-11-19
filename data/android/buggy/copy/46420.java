@java.lang.Override
public void onClick(android.view.View view) {
    playPreviousSong();
    if (mServiceBound)
        mBoundService.togglePlayer();
    
}