public boolean canSetSpeed() {
    if (((media) != null) && ((media.getMediaType()) == (de.danoeh.antennapod.feed.MediaType.AUDIO))) {
        return ((de.danoeh.antennapod.util.playback.AudioPlayer) (player)).canSetSpeed();
    }
    return false;
}