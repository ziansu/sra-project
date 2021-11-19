@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    stopPreview();
    this.ispriv = false;
    com.wx.imx53server.MyCamera.mCamera.release();
    android.util.Log.d(com.wx.imx53server.MyCamera.TAG, "surface destoryed,release resource");
}