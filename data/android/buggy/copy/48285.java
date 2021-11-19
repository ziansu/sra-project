public static int isPlaying() {
    if (((com.codepath.myapplication.Options.OptionsActivity.mPlayer) != null) && (com.codepath.myapplication.Options.OptionsActivity.mPlayer.getPlaybackState().isPlaying))
        return 1;
    else
        return 0;
    
}