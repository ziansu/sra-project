@java.lang.Override
public boolean onError(android.media.MediaPlayer mediaPlayer, int what, int extra) {
    com.medo.tweetspie.utils.IntentUtils.openUrl(this, url);
    exit();
    return false;
}