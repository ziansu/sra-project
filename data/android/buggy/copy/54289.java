@java.lang.Override
public void onPageScrollStateChanged(int state) {
    super.onPageScrollStateChanged(state);
    mUpButton.animate().alpha((state == (android.support.v4.view.ViewPager.SCROLL_STATE_IDLE) ? 1.0F : 0.0F)).setDuration(300);
}