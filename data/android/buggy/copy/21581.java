protected java.time.Duration toDelta(com.rdhaese.imperium.service.model.TimesheetEntry timesheetEntry) {
    java.time.Duration totalWorkTime = toTotalWorkTime(timesheetEntry);
    return timesheetEntry.getExpectedWorkTime().minus(totalWorkTime);
}