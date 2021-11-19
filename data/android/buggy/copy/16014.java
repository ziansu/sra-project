@java.lang.Override
public void onClick(android.view.View v) {
    if ((usedBitmap) != (defaultBitmap)) {
        usedBitmap.recycle();
        usedBitmap = defaultBitmap;
    }
    finish();
}