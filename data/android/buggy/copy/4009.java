@java.lang.Override
public void onConfigured(@android.support.annotation.NonNull
android.hardware.camera2.CameraCaptureSession session) {
    onCaptureSessionConfigured(session, CameraDevice.TEMPLATE_PREVIEW);
    if ((mVideoRecorderStopped) != null) {
        mCurrentlyRecording = false;
        android.util.Log.d(com.dylankpowers.timelapse.TimeLapseCapture.TAG, "Video recorder stopped.");
        mVideoRecorderStopped.onEvent();
        mVideoRecorderStopped = null;
    }
}