@java.lang.Override
public void onDestroy() {
    if ((mCameraView) != null) {
        mCameraView.disableView();
    }
    super.onDestroy();
}