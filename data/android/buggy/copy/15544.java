@java.lang.Override
public void onInitializationSuccess(com.google.android.youtube.player.YouTubePlayer.Provider provider, com.google.android.youtube.player.YouTubePlayer player, boolean wasRestored) {
    mPlayer = player;
    if (!wasRestored) {
        mPlayer = player;
        mPlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.MINIMAL);
        mPlayer.loadVideo("lc03JqnPbIk");
    }
}