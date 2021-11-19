@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (!(drawingViewHasSet)) {
        int height = com.youzan.fingertrace.BitmapUtil.getBitmapPositionInsideImageView(imageView)[3];
        resizeSurface(height);
        drawingViewHasSet = true;
    }
}