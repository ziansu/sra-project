@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    if (positionOffset > 0.5F) {
        position++;
    }
    updateIndicatorPositions(position, positionOffset, false);
}