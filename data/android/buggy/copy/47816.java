@java.lang.Override
public void onImageDownloaded(android.graphics.Bitmap bitmapResult) {
    imageLoadingProgress.setVisibility(View.GONE);
    floatingActionButton.setVisibility(View.VISIBLE);
    mainContentImageView.setImageBitmap(bitmapResult);
}