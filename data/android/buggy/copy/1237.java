public void insertVenue(Event event, Venue venue) {
    int venueID = SQLManager.insertVenueDetails(connection, venue.getName(), venue.getLocation(), venue.getType());
    venue.setVenueId(venueID);
}