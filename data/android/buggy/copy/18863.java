@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.pschuette.android.calendarlibrary.ExtendedCalendarView calendarView = new com.pschuette.android.calendarlibrary.ExtendedCalendarView(this, this);
    com.pschuette.android.calendarlibrary.CalendarSyncStateView syncStateView = new com.pschuette.android.calendarlibrary.CalendarSyncStateView(this, this);
    setContentView(syncStateView);
}