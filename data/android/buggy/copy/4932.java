@java.lang.Override
public long getTime() {
    if (!(finished)) {
        time = ((java.lang.System.currentTimeMillis()) - (startTime)) - (countdown);
    }
    return time;
}