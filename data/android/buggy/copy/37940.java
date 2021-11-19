public void removeEvent(java.lang.Long eventId, java.lang.Long eventDayId) {
    com.centric.centricexpress.models.EventDay eventDay = eventDayRepository.findById(eventDayId);
    eventDay.getEvents().remove(eventId);
    eventDayRepository.save(eventDay);
}