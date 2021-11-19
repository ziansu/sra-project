@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    if ((mp) == null) {
        mp = dalbers.com.noise.LoopMediaPlayer.create(this, R.raw.white);
    }
    return mBinder;
}