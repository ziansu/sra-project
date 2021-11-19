@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    com.xwhiteknuckle.soundfx.WidgetHelper.changeWidgetToPlay(this);
    stopSelf();
}