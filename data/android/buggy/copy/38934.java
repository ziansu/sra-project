@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.bugsense.trace.BugSenseHandler.initAndStartSession(this, com.kvest.developerslife.ui.activity.DevlifeBaseActivity.BUGSENS_APIKEY);
    supportRequestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
}