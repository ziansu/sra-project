@java.lang.Override
public void onAutoFocus(boolean success, android.hardware.Camera camera) {
    if (success) {
        camera.cancelAutoFocus();
    }
}