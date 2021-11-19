protected void endMeeting(java.lang.String roomId) throws cz.cesnet.shongo.api.jade.CommandException {
    java.lang.String message = "The+room+is+currently+unavailable+for+joining+/+Do+místnosti+se+aktuálně+není+možné+připojit";
    endMeeting(roomId, message, false, null);
}