@java.lang.Override
protected void onFreeBitmap(android.graphics.Bitmap bitmap) {
    if (!(bitmap.isRecycled())) {
        bitmap.recycle();
    }
}