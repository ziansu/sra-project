public void openTripOverview() {
    if ((adminView) == null) {
        tripView = new controller.common.TripView(this);
    }
    setNewView("Trip Overview", tripView);
    openView(currentViewNo);
}