@java.lang.Override
public void onCameraViewStarted(int width, int height) {
    mRgba = new org.opencv.core.Mat(height, width, org.opencv.core.CvType.CV_8UC4);
}