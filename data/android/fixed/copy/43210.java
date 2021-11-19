@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
@java.lang.Override
public void onGlobalLayout() {
    getFullImageView().setImageBitmap(fullBorader);
    getImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
    getImageView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
}