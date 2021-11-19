@java.lang.Override
public void stop() throws java.lang.IllegalStateException {
    super.stop();
    if ((mediaControllerView) != null) {
        mediaControllerView.updatePlayButton(true, true);
    }
}