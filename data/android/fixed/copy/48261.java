@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if (camera) {
        mScannerView.stopCamera();
    }
}