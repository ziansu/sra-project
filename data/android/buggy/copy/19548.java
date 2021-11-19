@java.lang.Override
public void onLoadError() {
    super.onLoadError();
    if ((mImageView) != null) {
        mImageView.setBackgroundColor(android.support.v4.content.ContextCompat.getColor(getContext(), R.color.light_gray));
    }
}