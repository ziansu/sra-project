private void initContentId(final net.gini.android.vision.internal.camera.photo.ExifReader exifReader, final java.lang.String userComment) {
    mContentId = exifReader.getValueForKeyFromUserComment(Exif.USER_COMMENT_CONTENT_ID, userComment);
    if ((mContentId) == null) {
        mContentId = generateUUID();
    }
}