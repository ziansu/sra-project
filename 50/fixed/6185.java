public static long calcTimeInTrip(long tripStartTime) {
    if (tripStartTime <= 0) {
        return 0;
    }else {
        java.util.Calendar curCal = java.util.Calendar.getInstance();
        long endTime = curCal.getTime().getTime();
        return endTime - tripStartTime;
    }
}