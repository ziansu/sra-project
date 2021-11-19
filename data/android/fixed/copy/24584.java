public void pauseSong() {
    if (mp.isPlaying()) {
        mp.pause();
        duration = mp.getCurrentPosition();
        pause = true;
    }
}