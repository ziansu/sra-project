@java.lang.Override
public void onClick(android.view.View v) {
    tripRowHolder.trip.setCurrentLocation(tripRowHolder.trip.getStartLocation());
    tripRowHolder.trip.startTrip();
    tripRowHolder.callback.onTripSelected(tripRowHolder.tripId);
}