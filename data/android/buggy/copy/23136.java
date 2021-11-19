@java.lang.Override
public long nextRoundingValue(long time) {
    long timeLocal = time;
    timeLocal = timeZone.convertUTCToLocal(time);
    long next = timeLocal + (interval);
    return timeZone.convertLocalToUTC(next, true);
}