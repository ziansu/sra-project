@java.lang.Override
public void onResume() {
    super.onResume();
    getCamera();
    if (isFlashOn) {
        flashLightOn();
    }
}