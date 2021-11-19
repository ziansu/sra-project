@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    com.xwhiteknuckle.soundfx.WidgetHelper.changeWidgetToStop(this);
    mp.start();
}