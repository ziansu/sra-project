public void insertVenue(Venue venue) {
    int venueID = SQLManager.insertVenueDetails(connection, venue.getName(), venue.getLocation(), venue.getType());
    venue.setVenueId(venueID);
}