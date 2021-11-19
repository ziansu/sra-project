@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... params) {
    mProgressDialog.show();
    android.graphics.Bitmap thumbnail = mStorage.getImageThumbnail(params[0]);
    mProgressDialog.dismiss();
    return thumbnail;
}