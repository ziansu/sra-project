@java.lang.Override
public void run() {
    if (currentCamera.equals(mCamera.getCamera())) {
        mCallback.onAutoFocus(b, mCamera);
    }
}