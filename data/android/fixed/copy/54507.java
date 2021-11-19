public void playAction() {
    mMediaPlayer.start();
    playState = PLAYSTATE.IS_PLAYING;
    org.greenrobot.eventbus.EventBus.getDefault().post(mMediaPlayer);
}