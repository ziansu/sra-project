public void playNext() {
    int random = ((int) ((java.lang.Math.random()) * (songManager.size())));
    playSong(songManager.getSongId(random));
}