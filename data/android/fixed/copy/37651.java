private void stopBgm() {
    if (bgmPlayer.isPlaying()) {
        bgmPlayer.stop();
    }
    bgmPlayer = null;
}