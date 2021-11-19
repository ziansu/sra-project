public synchronized void playNext() {
    if ((mNowPlaying.next()) != null) {
        playFetched(mNowPlaying.next().getMusicLocation());
    }
}