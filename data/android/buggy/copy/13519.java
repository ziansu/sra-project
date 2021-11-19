@java.lang.Override
public void onResume() {
    android.util.Log.d(org.eyeseetea.malariacare.DashboardActivity.TAG, "onResume");
    super.onResume();
    getSurveysFromService();
    startProgress();
}