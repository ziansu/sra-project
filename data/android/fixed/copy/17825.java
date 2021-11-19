public void previousSong() {
    (currentSongPosition)--;
    startSong(currentListSongs.get(currentSongPosition).getSongUri(), currentListSongs.get(currentSongPosition).getSongName());
}