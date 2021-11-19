@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    com.liangmayong.qrcode.view.DecodeScanView.setCameraDisplayOrientation(activity, com.liangmayong.qrcode.camera.CameraManager.get().getCamera());
}