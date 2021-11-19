@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    com.xwhiteknuckle.soundfx.WidgetHelper.changeWidgetToPlay(this);
    stopSelf();
    return true;
}