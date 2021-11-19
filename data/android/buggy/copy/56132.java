public itinerator.itinerary.ItineraryBuilder addActivityAtPosition(itinerator.itinerary.Activity activity, int position) {
    if (position >= (activities.size())) {
        activities.add(activity);
    }else {
        activities.add(position, activity);
    }
    return this;
}