public void setAllAttendees(models.Attendee addToEvent) {
    int thisID = addToEvent.getId();
    models.Attendee thisAttendee = findAttendeeById(thisID);
    allAttendees.add(thisAttendee);
}