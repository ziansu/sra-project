@java.lang.Override
public void onResume() {
    super.onResume();
    mRefreshMarkers = true;
    mUpdateRefreshHandler = new android.os.Handler();
    setupUI();
}