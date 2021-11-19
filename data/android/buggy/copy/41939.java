public long countByTimesheet(final long timesheetId) {
    return timeEntryPersistence.countByTimesheet(userId);
}