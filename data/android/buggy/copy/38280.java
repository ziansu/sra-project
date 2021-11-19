private void pausePlay() {
    mp.pause();
    updateUIHandler.removeCallbacks(updateUIRunnable);
    popNotification(musics.get(current));
}