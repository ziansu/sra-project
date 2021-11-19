@java.lang.Override
public void artistSearchEnded() {
    if (((mTracksFragment) != null) && (mTracksFragment.isVisible())) {
        mTracksFragment.setEmptyText("Select an artist to see top 10 tracks");
    }
}