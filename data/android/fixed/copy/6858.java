private void playMusic() {
    if ((!(com.hugosama.samalinne.Utils.isOnSilence(this))) && (!(mediaPlayer.isPlaying()))) {
        mediaPlayer.start();
    }
}