private void initContentId(final java.lang.String userComment) {
    mContentId = net.gini.android.vision.internal.camera.photo.ExifReader.getValueForKeyFromUserComment(Exif.USER_COMMENT_CONTENT_ID, userComment);
    if ((mContentId) == null) {
        mContentId = generateUUID();
    }
}