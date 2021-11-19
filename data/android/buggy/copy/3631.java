public void playAudio(android.media.MediaPlayer mp) {
    if (mp.isPlaying()) {
        mp.pause();
    }else {
        mp.start();
    }
}