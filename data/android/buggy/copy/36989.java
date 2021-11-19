private org.grails.ignite.ScheduledRunnable findScheduleDataByName(java.lang.String name) {
    for (org.grails.ignite.ScheduledRunnable scheduleDatum : org.grails.ignite.DistributedSchedulerServiceImpl.schedule) {
        if (scheduleDatum.toString().equals(name))
            return scheduleDatum;
        
    }
    return null;
}