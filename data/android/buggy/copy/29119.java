@java.lang.Override
protected void done() {
    if (!(isCancelled()))
        _video.playMedia(voxspell.BestMediaPlayer.NEGATIVE_VIDEO);
    
}