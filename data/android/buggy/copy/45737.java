private void buildWebcam() {
    webcam = module_PI.Raspberry_PI.main.Webcam.getDefault();
    module_PI.Raspberry_PI.main.Webcam webcam = module_PI.Raspberry_PI.main.Webcam.getDefault();
    webcam.setCustomViewSizes(imageResolutions);
    webcam.setViewSize(WebcamResolution.HD720.getSize());
}