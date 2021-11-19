@java.lang.Override
public void onSeekComplete(android.media.MediaPlayer mp) {
    android.util.Log.e(com.infthink.flintreceiver.receiver.SimpleMediaPlayerActivity.TAG, "onSeekComplete!");
    mFlintVideo.notifyEvents(FlintVideo.SEEKED, "Media SEEKED");
}