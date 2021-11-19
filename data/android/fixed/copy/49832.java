@java.lang.Override
public void run() {
    if ((currentCamera != null) && (currentCamera.equals(mCamera.getCamera()))) {
        mCallback.onAutoFocus(b, mCamera);
    }
}