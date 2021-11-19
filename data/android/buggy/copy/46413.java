@java.lang.Override
public void run() {
    refreshTotalTime(true);
    totalTimeHandler.postDelayed(this, com.jakehilborn.speedr.MainActivity.TOTAL_TIME_REFRESH_FREQ);
}