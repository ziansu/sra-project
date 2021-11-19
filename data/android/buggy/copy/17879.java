@java.lang.Override
public void onRefresh() {
    java.lang.String compare1 = com.wieland.www.scheduletest.schedule.Schedule.getUpdateDate(1, this);
    java.lang.String compare2 = com.wieland.www.scheduletest.schedule.Schedule.getUpdateDate(2, this);
    com.wieland.www.scheduletest.activities.MainActivity.Refresh refresh = new com.wieland.www.scheduletest.activities.MainActivity.Refresh(this, compare1, compare2);
    refresh.execute();
}