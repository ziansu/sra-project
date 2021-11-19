private void resumePlayer() {
    mPlayer.seekTo(mPosition);
    mPlayer.start();
}