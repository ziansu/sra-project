private void savePlayback() {
    ipv.stop();
    control.setBackgroundResource(R.drawable.ic_media_play);
    player.setPlayWhenReady(false);
}