public void addEvent(java.lang.String eventId, java.lang.String eventDayId) {
    com.centric.centricexpress.models.EventDay eventDay = eventDayRepository.findById(eventDayId);
    eventDay.getEvents().add(eventId);
    eventDayRepository.save(eventDay);
}