@java.lang.Override
public void onCropped(android.graphics.Bitmap bitmap) {
    if (bitmap != null) {
        compress(bitmap);
    }
}