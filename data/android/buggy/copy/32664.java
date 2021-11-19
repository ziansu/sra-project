@java.lang.Override
public long roundKey(long utcMillis) {
    long timeLocal = utcMillis;
    timeLocal = timeZone.convertUTCToLocal(utcMillis);
    long rounded = field.roundFloor(timeLocal);
    return timeZone.convertLocalToUTC(rounded, true, utcMillis);
}