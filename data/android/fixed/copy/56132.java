public itinerator.itinerary.ItineraryBuilder addActivityAtPosition(itinerator.itinerary.Activity activity, java.lang.Integer position) {
    activities.put(position, activity);
    return this;
}