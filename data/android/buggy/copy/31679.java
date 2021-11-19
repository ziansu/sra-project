@java.lang.Override
public boolean isStreamServicePlaying() {
    if ((streamService) == null) {
        return false;
    }
    return streamService.isPlaying();
}