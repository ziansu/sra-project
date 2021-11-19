@java.lang.Override
public void onClick(android.view.View v) {
    me.vucko.calendarapp.alarm.database.Database.init(context);
    me.vucko.calendarapp.alarm.database.Database.deleteEntry(alarms.get(position));
    alarms.remove(position);
    callAlarmScheduleService();
    notifyDataSetChanged();
}