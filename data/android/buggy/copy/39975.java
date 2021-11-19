@java.lang.Override
public void onClick(android.view.View v) {
    mViewPager.setCurrentItem(((mViewPager.getCurrentItem()) - 1));
    android.util.Log.i("SK-DEBUG", "Left Button is Clicked");
}