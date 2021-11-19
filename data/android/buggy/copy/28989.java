@java.lang.Override
public void run() {
    mImageReader.setOnImageAvailableListener(null, handler);
    mImageReader.close();
    mProjection.stop();
    if ((callback) != null) {
        callback.onScreenshotFailed(tw.firemaples.onscreenocr.screenshot.ScreenshotHandler.ERROR_CODE_TIMEOUT);
    }
}