@java.lang.Override
public void onPageSelected(int position) {
    if ((mViewPager) != null) {
        if (position < 3) {
            android.util.Log.d(DEBUG_KEY, ("item id is " + position));
        }
    }
}