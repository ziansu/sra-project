public void play() {
    if ((mPlayer) == null)
        return ;
    
    if (!(mPlayer.isPlaying()))
        mPlayer.start();
    
    if (!(isTimingThreadRunning))
        startTimingThread();
    
}