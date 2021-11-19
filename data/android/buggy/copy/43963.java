@java.lang.Override
public void pause() throws java.lang.IllegalStateException {
    super.pause();
    mediaControllerView.updatePlayButton(true, false);
}