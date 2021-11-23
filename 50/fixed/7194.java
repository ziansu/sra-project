@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    hideStatusBar();
    mFirebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(this);
    registerRongCloudReceiveMessageListener();
}