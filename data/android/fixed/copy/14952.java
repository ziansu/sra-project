@java.lang.Override
public void resume() {
    if ((mediaPlayer) == null)
        return ;
    
    mediaPlayer.start();
    if (mediaPlayer.isPlaying()) {
        refreshController(com.daomingedu.ijkplayertest.coustomview.PLAYER_STATE_PLAYING);
    }else {
        refreshController(com.daomingedu.ijkplayertest.coustomview.STATE_CURRENT_NULL);
    }
}