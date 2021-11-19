@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    jumpup.imi.fb4.htw.de.jumpupandroid.portal.trip.entity.search.SingleTripQueryResult singleTripQueryResult = singleTripsQueryResultListAdapter.getItem(position);
    navigateToViewTrip(singleTripQueryResult.getTrip());
}