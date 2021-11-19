@com.fasterxml.jackson.annotation.JsonIgnore
public boolean isSetupAndAfterNotifications() {
    return (java.lang.Boolean.TRUE.equals(setupComplete)) && (((fundersPanelDate) != null) && (fundersPanelDate.isBefore(java.time.ZonedDateTime.now())));
}