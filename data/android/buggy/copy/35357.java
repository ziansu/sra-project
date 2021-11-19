@java.lang.Override
public void hideTrackList(@org.jetbrains.annotations.NotNull
nl.sogeti.android.gpstracker.ng.tracklist.TrackListFragment trackListFragment) {
    getSupportFragmentManager().popBackStack(nl.sogeti.android.gpstracker.ng.track.TrackActivity.TRANSACTION_TRACKS, android.support.v4.app.FragmentManager.POP_BACK_STACK_INCLUSIVE);
}