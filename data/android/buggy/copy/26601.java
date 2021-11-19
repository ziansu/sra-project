@com.google.api.server.spi.config.ApiMethod(name = "appointment.test", path = "appointment.test", httpMethod = "post")
public com.google.appengine.archetypes.scheduler.wrappers.WrappedBoolean test(final com.google.appengine.api.users.User user) throws java.io.IOException {
    com.google.appengine.archetypes.scheduler.service.Quickstart.addEvent(ConstantsSecret.calendarId, user, com.google.appengine.archetypes.scheduler.service.EventCreator.createEvent());
    return null;
}