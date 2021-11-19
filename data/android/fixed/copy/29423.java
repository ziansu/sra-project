@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((com.charlesdrews.herecomethehawks.MusicService.mPlayer) != null) {
        com.charlesdrews.herecomethehawks.MusicService.mPlayer.release();
    }
}