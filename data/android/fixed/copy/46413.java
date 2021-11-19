@java.lang.Override
public void run() {
    refreshTotalTime(null);
    totalTimeHandler.postDelayed(this, com.jakehilborn.speedr.MainActivity.TOTAL_TIME_REFRESH_FREQ);
}