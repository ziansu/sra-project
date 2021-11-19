private void startPlay() {
    if ((videoPlayer) == null) {
        return ;
    }
    videoPlayer.start(GlobalParams.path);
}