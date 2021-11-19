private void playFn() {
    if (startMusicInited) {
        myMediaPlayer.start();
        isPlaying = true;
    }else {
        playMusic(myMusicList[curIndex]);
    }
}