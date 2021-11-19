public void switchSong(onion.szxb74om7zsmd2jm.limitlesslabyrinth.mechanics.MusicDirector.SongName s) {
    setNowPlaying(s);
    if (nowPlaying.isPlaying()) {
        stop();
    }
    play();
}