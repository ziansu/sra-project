public void play() {
    if (myAudioFile.isFinished())
        restart();
    else
        if (!(myAudioFile.isPlaying())) {
            myAudioFile.play();
            mscScroll3.start();
        }
    
}