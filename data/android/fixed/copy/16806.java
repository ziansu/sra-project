public void start() {
    mediaPlayer.start();
    setState(edu.calpoly.idulkin.podcrust.MediaPlayerService.MP_STATE.PLAYING);
    android.util.Log.e("Media Player Service", ("State: " + (getState())));
}