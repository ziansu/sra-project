private void playFn() {
    isPlaying = false;
    if (startMusicInited) {
        myMediaPlayer.start();
        isPlaying = true;
    }else {
        playMusic(myMusicList[curIndex]);
    }
}