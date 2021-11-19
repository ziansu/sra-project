public void play() {
    if (!(mPlayer.isPlaying()))
        mPlayer.start();
    
    if (!(isTimingThreadRunning))
        startTimingThread();
    
}