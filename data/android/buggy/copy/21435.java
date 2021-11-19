private void createFromPicture(android.view.LayoutInflater mLayoutInflator, android.graphics.Typeface bitter, java.lang.String headerTitle) {
    mCamera.setHeader(headerTitle);
    mCamera.setType(type);
    mCamera.takePicture();
}