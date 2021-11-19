private static org.joda.time.DateTime getEndDate(org.quartz.Trigger trigger) {
    return new org.joda.time.DateTime(trigger.getEndTime());
}