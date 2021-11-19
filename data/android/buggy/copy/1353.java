private void updateFrames(org.opencv.core.Mat cameraFrame) {
    currentImage.copyTo(previousImage);
    nextImage.copyTo(currentImage);
    grimoire.image_analysis.cameras.CameraHelper.blurredAndGrayscaleFrame(cameraFrame, nextImage);
}