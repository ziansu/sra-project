@java.lang.Override
public void pause() {
    playbackPaused = true;
    musicSrv.pausePlayer();
    controller.show(0);
}