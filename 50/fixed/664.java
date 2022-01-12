@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... paths) {
    android.graphics.Point screenSize = getDisplaySize(this);
    return decodeSampledBitmapResource(paths[0], screenSize.x, screenSize.y);
}