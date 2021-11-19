public static int getLeftTime() {
    if (null != (com.junyou.hbks.TimeManager.activity)) {
        int leftTime = com.junyou.hbks.TimeManager.activity.getSharedPreferences("config", com.junyou.hbks.TimeManager.activity.MODE_PRIVATE).getInt(com.junyou.hbks.TimeManager.TOTAL_TIME, 0);
        return leftTime;
    }
    return 0;
}