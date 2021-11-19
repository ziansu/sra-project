@java.lang.Override
public long roundKey(long utcMillis) {
    long local = preTz.convertUTCToLocal(utcMillis);
    return preTz.convertLocalToUTC(field.roundFloor(local), true, utcMillis);
}