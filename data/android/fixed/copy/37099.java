private void showAudioControls() {
    if ((areAudioControlsAvailable()) && (!(audioControls.isShowing()))) {
        audioControls.show(0);
    }
}