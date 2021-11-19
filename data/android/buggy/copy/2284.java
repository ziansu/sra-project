private void saveImage() {
    if ((saveImage) == true) {
        org.bytedeco.javacpp.opencv_highgui.cvSaveImage("PATH", croppedFace);
    }
}