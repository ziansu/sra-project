@java.lang.Override
public boolean todayHasEvent(long startOfDay) {
    return dayEventMap.containsKey(startOfDay);
}