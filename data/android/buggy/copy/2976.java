@java.lang.Override
public int getDuration() {
    if ((com.remotemplayer.MusicService.getInstance()) != null) {
        return com.remotemplayer.MusicService.getInstance().getMusicDuration();
    }
    return 0;
}