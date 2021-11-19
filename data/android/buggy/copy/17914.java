public void onRefreshed() {
    com.wieland.www.scheduletest.activities.MainActivity.Refresh refresh = new com.wieland.www.scheduletest.activities.MainActivity.Refresh(this, com.wieland.www.scheduletest.schedule.Schedule.getUpdateDate(1, this), com.wieland.www.scheduletest.schedule.Schedule.getUpdateDate(2, this));
    refresh.execute();
}