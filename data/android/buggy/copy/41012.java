private void initAdapter() {
    com.serien.android.androidserienprojekt.adapter.CustomSeriesExpandableListAdapter expListAdapter = new com.serien.android.androidserienprojekt.adapter.CustomSeriesExpandableListAdapter(getActivity(), seasonList, seriesCollection, seasonsWatchedTemp, db.getSeriesItem(guideboxName));
    expListView.setAdapter(expListAdapter);
}