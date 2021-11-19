@java.lang.Override
public void onClick(android.view.View view) {
    mCamera.takePicture(mShutterCallback, mRawCallback, null, mJPEGCallback);
}