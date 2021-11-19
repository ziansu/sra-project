public long getCurrent() {
    long result = 0;
    if (complete) {
        result = songs.get(currentPosition).getSongDuration();
    }else {
        result = mediaPlayer.getCurrentPosition();
    }
    return result;
}