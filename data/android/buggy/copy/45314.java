@java.lang.Override
public void onPause() {
    super.onPause();
    showControls();
    tearDownVideoControlsHandler();
    if (!(isChangingConfigurations())) {
        pause();
    }
    if (isFinishing()) {
        tearDownVideoPlayback();
    }
}