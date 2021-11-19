public Song removeSong(int intIndex) {
    Song objSong = this.getSong(intIndex);
    if (objSong != null) {
        this.objPlayList.remove(intIndex);
    }
    return objSong;
}