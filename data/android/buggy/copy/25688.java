@java.lang.Override
public int getCurrentPosition() {
    if ((player) != null) {
        return ((int) (player.getCurrentPlaybackTime()));
    }
    return 0;
}