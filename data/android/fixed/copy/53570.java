@java.lang.Override
public long roundKey(long utcMillis) {
    long offset = preTz.getOffset(utcMillis);
    long time = utcMillis + offset;
    return (field.roundFloor(time)) - offset;
}