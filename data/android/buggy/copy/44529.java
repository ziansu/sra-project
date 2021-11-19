@java.lang.Override
public void stop() throws java.lang.IllegalStateException {
    super.stop();
    mediaControllerView.updatePlayButton(true, true);
}