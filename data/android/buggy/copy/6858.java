private void playMusic() {
    if (mediaPlayer.isPlaying())
        mediaPlayer.stop();
    
    if (!(com.hugosama.samalinne.Utils.isOnSilence(this))) {
        mediaPlayer.start();
    }
}