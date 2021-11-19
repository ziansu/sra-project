@java.lang.Override
public void onMainViewAppeared(com.innovativetech.audio.audiobookmaster.fabreveallayout.FABRevealLayout fabRevealLayout, android.view.View mainView) {
    if (((mMediaPlayer) == null) || (!(mMediaPlayer.isPlaying()))) {
        showMainViewItems();
    }else {
        showSecondaryViewItems();
    }
}