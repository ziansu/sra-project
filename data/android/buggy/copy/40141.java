@java.lang.Override
public void onApplicationResumed() {
    setUpdateProgressTask(true);
    if (isAdDisplayed) {
        showControlsWithPlay();
    }else {
        mPlayerControlsView.setSeekBarMode(true);
        if (!(isPlaybackEndedState())) {
            showControlsWithPlay();
        }
    }
}