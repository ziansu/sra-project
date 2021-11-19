@java.lang.Override
public void onResume() {
    super.onResume();
    mScannerView.setResultHandler(this);
    mScannerView.startCamera();
}