@java.lang.Override
public void onPlaying() {
    if (isPaused) {
        isPaused = false;
        messageType = VIDEO_UNPAUSE;
        messageService.sendMessage(com.gmail.markdevw.wetube.WeTubeApplication.getSharedDataSource().getCurrentRecipient().getId(), "/unpause$");
    }
}