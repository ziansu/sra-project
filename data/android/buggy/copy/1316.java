public boolean canSetSpeed() {
    if ((media.getMediaType()) == (de.danoeh.antennapod.feed.MediaType.AUDIO)) {
        return ((de.danoeh.antennapod.util.playback.AudioPlayer) (player)).canSetSpeed();
    }
    return false;
}