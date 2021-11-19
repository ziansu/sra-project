public static long calcTimeInTrip(long tripStartTime) {
    java.util.Calendar curCal = java.util.Calendar.getInstance();
    long endTime = curCal.getTime().getTime();
    return endTime - tripStartTime;
}