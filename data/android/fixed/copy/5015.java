public void playSong(int intIndex) {
    Song objSong = this.getSong(intIndex);
    if (objSong == null) {
    }else {
        objCurSong = objSong;
        objSong.play();
    }
}