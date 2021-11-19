private void fetchLibraryEntries() {
    mRefreshLayout.setRefreshing(true);
    com.charlesmadere.hummingbird.networking.Api.getLibraryEntries(mUser, mWatchingStatus, new com.charlesmadere.hummingbird.fragments.AnimeLibraryFragment.GetLibraryEntriesListener(this));
}