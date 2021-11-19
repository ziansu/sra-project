@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    mDbHelper.queryTable(table, contentArray);
    scrollLoading = false;
    de.greenrobot.event.EventBus.getDefault().postSticky(new com.projects.nosleepproject.events.FailedLoadEvent(contentArray));
    android.util.Log.e("getListings: ", "failed to get list");
}