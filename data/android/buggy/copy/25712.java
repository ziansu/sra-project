@java.lang.Override
public void playbackFinished() {
    playNext();
    com.awaker.audio.EventRouter.raiseEvent(GlobalEvent.PLAYBACK_NEW_SONG);
}