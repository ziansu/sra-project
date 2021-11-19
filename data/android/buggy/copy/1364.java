public void update(java.util.ArrayList<com.ajanthan.alarmbot.Objects.Alarm> alarms) {
    mAlarms = alarms;
    notifyDataSetChanged();
    mRealm.close();
}