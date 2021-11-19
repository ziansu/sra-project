public void pause_song() {
    if (isPlaying) {
        mp.pause();
        isPlaying = false;
    }
}