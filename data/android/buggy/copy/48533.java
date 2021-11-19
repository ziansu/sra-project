@java.lang.Override
public void run() {
    org.hisp.dhis.android.sdk.controllers.DhisService.loadInitialData(this);
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            showSelectProgramFragment();
        }
    });
}