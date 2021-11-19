@java.lang.Override
public void onCaptureCompleted(com.holenstudio.excamera2.CameraCaptureSession session, com.holenstudio.excamera2.CaptureRequest request, com.holenstudio.excamera2.TotalCaptureResult result) {
    android.widget.Toast.makeText(this, ("Saved: " + (mPictureFile.getName())), Toast.LENGTH_SHORT).show();
    unlockFocus();
}