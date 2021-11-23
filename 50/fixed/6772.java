@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    mp.start();
    com.xwhiteknuckle.soundfx.WidgetHelper.changeWidgetToStop(this);
}