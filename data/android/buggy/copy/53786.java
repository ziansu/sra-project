@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    android.util.Log.i(com.kimkevin.android.MainActivity.TAG, ((("onPageScrolled : " + position) + " , ") + positionOffsetPixels));
    mFadeImageSwitcher.showImage(position, positionOffsetPixels);
}