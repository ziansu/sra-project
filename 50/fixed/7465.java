@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    scrollLoading = false;
    de.greenrobot.event.EventBus.getDefault().postSticky(new com.projects.nosleepproject.events.FailedLoadEvent(new java.util.ArrayList<android.content.ContentValues>()));
}