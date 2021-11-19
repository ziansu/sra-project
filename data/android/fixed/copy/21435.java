private void createFromPicture(java.lang.String headerTitle) {
    mCamera.setHeader(headerTitle);
    mCamera.setType(type);
    mCamera.takePicture();
}