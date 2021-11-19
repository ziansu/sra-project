@java.lang.Override
public void onResume() {
    if ((mQRCamera) == null) {
        mQRCamera = new com.airbitz.objects.QRCamera(this, mCameraLayout);
        mQRCamera.setOnScanResultListener(this);
        mQRCamera.startCamera();
    }
}