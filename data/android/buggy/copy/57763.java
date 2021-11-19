@java.lang.Override
public void onGlobalLayout() {
    imageView.setVisibility(View.GONE);
    de.czyrux.countrykata.ui.util.ViewUtils.removeOnGlobalLayoutListener(viewPager, this);
}