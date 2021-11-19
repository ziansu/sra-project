private void toggleArchive() {
    nl.asymmetrics.droidshows.DroidShows.showArchive = ((nl.asymmetrics.droidshows.DroidShows.showArchive) + 1) % 2;
    getSeries();
    nl.asymmetrics.droidshows.DroidShows.listView.setSelection(0);
}