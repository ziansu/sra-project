@java.lang.Override
public void onAdFailedToLoad(int errorCode) {
    super.onAdFailedToLoad(errorCode);
    com.crashlytics.android.Crashlytics.log(("Banner Failed To Load: " + errorCode));
}