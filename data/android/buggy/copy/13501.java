private void captureImage() {
    camera.takePicture(shutterCallback, rawCallback, pngCallback);
    stopCamera();
    startCamera();
}