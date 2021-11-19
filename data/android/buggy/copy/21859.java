public void playSong(int intIndex) {
    Song objSong = getSong(intIndex);
    if (objSong == null) {
        java.lang.System.out.println("Failed to get the song.");
    }else {
        objCurSong = objSong;
        objSong.play();
    }
}