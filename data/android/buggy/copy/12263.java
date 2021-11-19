@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... params) {
    mProgressDialog.show();
    android.graphics.Bitmap thumbnail = com.comp.iitb.vialogue.library.Storage.getVideoThumbnail(new java.io.File(params[0]).getAbsolutePath());
    mProgressDialog.dismiss();
    return thumbnail;
}