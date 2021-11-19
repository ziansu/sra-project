@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    if (positionOffset > 0) {
        this.position = position;
        this.positionOffset = positionOffset;
        invalidate();
    }
}