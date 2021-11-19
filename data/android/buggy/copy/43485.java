private void initRotationForDisplay(final net.gini.android.vision.internal.camera.photo.ExifReader exifReader) {
    if (((mImageDocument) != null) && (mImageDocument.isImported())) {
        mRotationForDisplay = exifReader.getOrientationAsDegrees();
    }
}