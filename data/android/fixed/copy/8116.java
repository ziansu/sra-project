@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((mTracksFragment) != null) {
        getSupportFragmentManager().putFragment(outState, "tracks_fragment", mTracksFragment);
    }
}