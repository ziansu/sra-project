public void removeSongFromPlaylist() {
    if (((selectedPlaylist) != null) && ((selectedSong) != null)) {
        playlistdao.removeSongfromPlaylist(selectedPlaylist, selectedSong, activeuser);
    }
}