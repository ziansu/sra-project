@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
@java.lang.Override
public void onGlobalLayout() {
    getFullImageView().setImageBitmap(fullBorader);
    ((com.mixcolours.photoshare.photoview.PhotoView) (getImageView())).setScaleType(ImageView.ScaleType.CENTER_CROP);
    getImageView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
}