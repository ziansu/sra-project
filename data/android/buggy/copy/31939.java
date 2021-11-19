public void showArtistsDetails(java.util.List<au.com.kbrsolutions.spotifystreamer.core.ArtistDetails> artistsDetailsList, int listViewFirstVisiblePosition) {
    this.artistsDetailsList = artistsDetailsList;
    artistArrayAdapter.clear();
    artistArrayAdapter.addAll(artistsDetailsList);
    mListView.setSelection(listViewFirstVisiblePosition);
}