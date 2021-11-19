@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    if (position == 0) {
        updateContent(position);
    }
}