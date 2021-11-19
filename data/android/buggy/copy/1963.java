public static void validateTimes(org.joda.time.DateTime startTime, org.joda.time.DateTime endTime) {
    if (!(startTime.isBefore(endTime)))
        throw monasca.api.resource.exception.Exceptions.badRequest("start_time (%s) must be before end_time (%s)", startTime, endTime);
    
}