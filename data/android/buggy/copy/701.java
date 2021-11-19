@java.lang.Override
protected void onCancelled(com.owncloud.android.ui.preview.PreviewImageFragment.LoadImage result) {
    if ((result.bitmap) != null) {
        result.bitmap.recycle();
    }
}