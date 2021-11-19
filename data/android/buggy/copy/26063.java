public void removeAttendant(java.lang.Long eventId, java.lang.Long attendantId) {
    com.centric.centricexpress.models.Event event = eventRepository.findById(eventId);
    event.getAttendants().remove(attendantId);
    eventRepository.save(event);
}