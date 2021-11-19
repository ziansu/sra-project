public int getPosn() {
    try {
        return musicPlayer.getCurrentPosition();
    } catch (java.lang.IllegalStateException e) {
        return trackToPlay.getStopTimeInMilliseconds();
    }
}