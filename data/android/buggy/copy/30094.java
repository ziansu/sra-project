private void fetchEventList(android.widget.RelativeLayout mainLayout, android.widget.FrameLayout progressLayout) {
    try {
        new com.groupr.util.GetUserEventsAsyncTask(mContext, java.lang.Long.parseLong(mUserId), mainLayout, progressLayout).execute();
    } catch (java.lang.NumberFormatException exception) {
    }
}