@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.d(org.eyeseetea.malariacare.fragments.DashboardUnsentFragment.TAG, "onCreate");
    registerSurveysReceiver();
}