public float getCurrentPlaybackTime() {
    if ((player) != null) {
        return (player.getCurrentPlaybackTime()) / 1000.0F;
    }
    return 0.0F;
}