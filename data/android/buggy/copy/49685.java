public void removeSongFromPlaylist() {
    if (((selectedPlaylist) != null) && ((selectedSong) != null)) {
        java.lang.System.out.println("SUCCESS!");
        playlistdao.removeSongfromPlaylist(selectedPlaylist, selectedSong, activeuser);
    }
}