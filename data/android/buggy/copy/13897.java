@java.lang.Override
public void onHostResume() {
    final android.app.Activity activity = getCurrentActivity();
    assert activity != null;
    activity.registerReceiver(receiver, new com.github.yamill.orientation.IntentFilter("onConfigurationChanged"));
}