@java.lang.Override
public void onBitmapLoaded(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    drawView.removeBackgroundImage();
    settings.backgroundImagePhone = bitmap;
    drawView.invalidate();
    btnRemoveImage.setVisibility(View.VISIBLE);
}