public void invalidateSelection() {
    count = 1;
    calendarDateManager.clearCalendarData();
    new android.os.Handler().post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            notifyDataSetChanged();
        }
    });
}