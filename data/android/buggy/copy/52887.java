private void nextSong() {
    while ((playList.peek()) == null) {
        updatePlayList();
    } 
    mine.android.modules.ClockSong song = playList.poll();
    playClockSong(song);
}