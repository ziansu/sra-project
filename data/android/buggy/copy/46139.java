@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    mediaPlayer.reset();
    mediaPlayer.release();
    return super.onUnbind(intent);
}