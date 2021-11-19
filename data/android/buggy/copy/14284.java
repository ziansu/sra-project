@java.lang.Override
public timeline.Event getEvent(int eventId) throws model.exceptions.NoSuchEventException {
    this.validateEvent(eventId);
    return ((timeline.Event) (this.serializer.getItem(eventId)));
}