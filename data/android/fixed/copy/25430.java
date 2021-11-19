@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    android.widget.Toast.makeText(mContext, "Media player entered Error state ", Toast.LENGTH_SHORT).show();
    mp.reset();
    return false;
}