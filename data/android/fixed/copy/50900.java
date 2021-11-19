@java.lang.Override
public void OnPlayFinished() {
    if (isLastSong) {
        player.stopTVPlayer();
        isLastSong = false;
    }else {
        player.nextMusic();
    }
}