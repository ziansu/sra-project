public static void setResultBitmap(android.graphics.Bitmap bitmap) {
    com.framgia.photoalbum.util.CommonUtils.recycleBitmap(com.framgia.photoalbum.ui.activity.EditActivity.sResultBitmap);
    com.framgia.photoalbum.ui.activity.EditActivity.sResultBitmap = bitmap;
}