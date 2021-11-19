public void setScheduledDate(java.time.ZonedDateTime scheduledDate) {
    this.scheduledDate = scheduledDate.withZoneSameInstant(java.time.ZoneOffset.UTC);
}