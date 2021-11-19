@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (mIsPlaying) {
        mIsPlaying = false;
        mPlayerControl.setImageResource(R.drawable.ic_play_arrow_24dp);
    }
}