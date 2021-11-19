@java.lang.Override
public void onTrackSelected(int trackPos, android.view.View mediaListItemView) {
    if ((audioPlayerFragment) != null) {
        audioPlayerFragment.setTrack(trackPos);
        audioPlayerFragment.setCurrentMediaListItemView(mediaListItemView);
    }
}