@java.lang.Override
public void onAdClosed() {
    super.onAdClosed();
    com.crashlytics.android.Crashlytics.log("onAdClosed");
}