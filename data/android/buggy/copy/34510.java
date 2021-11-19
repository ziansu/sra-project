@java.lang.Override
public void onFinish() {
    de.greenrobot.event.EventBus.getDefault().postSticky(new com.sqvat.squat.events.RestFinished(position));
    android.media.MediaPlayer mPlayer = android.media.MediaPlayer.create(getActivity(), R.raw.timer_finish);
    mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
    mPlayer.start();
}