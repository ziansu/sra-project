public synchronized void playNext() {
    playFetched(mNowPlaying.next().getMusicLocation());
}