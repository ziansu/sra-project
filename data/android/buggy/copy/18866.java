public boolean setCurrentSong(uk.org.ngo.squeezer.model.Song song) {
    if (song == (currentSong))
        return false;
    
    currentSong = song;
    return true;
}