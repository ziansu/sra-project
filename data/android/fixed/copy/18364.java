public void play() {
    if (myAudioFile.isFinished())
        myAudioFile.play();
    else
        if (!(myAudioFile.isPlaying())) {
            myAudioFile.play();
            mscScroll3.start();
        }
    
}