protected org.quartz.spi.OperableTrigger buildTrigger(java.lang.String triggerName, java.lang.String triggerGroup, org.quartz.JobDetail job, java.lang.Long startAt) {
    return buildTrigger(triggerName, triggerGroup, job, startAt, null);
}