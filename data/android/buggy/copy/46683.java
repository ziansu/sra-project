@java.lang.Override
public void beforeRequestProcessing() {
    userCalendars = org.silverpeas.core.calendar.Calendar.getByComponentInstanceId(getComponentInstanceId());
    if (userCalendars.isEmpty()) {
        org.silverpeas.web.usercalendar.UserCalendarInitialization.initialize(getComponentInstanceId());
    }
}