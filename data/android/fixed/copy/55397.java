@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... params) {
    android.graphics.Bitmap thumbnail = mStorage.getImageThumbnail(params[0]);
    return thumbnail;
}