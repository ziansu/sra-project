private void requestDeparture() {
    android.util.Log.d(getClass().toString(), "requestDeparture()");
    mDepList.clear();
    journeyPlanner.getDepartureBoard(this, java.util.Calendar.getInstance(), stopLocation);
    departureSwipeRefreshLayout.setRefreshing(true);
}