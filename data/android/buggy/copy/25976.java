@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    android.util.Log.d(com.xiaohong.codecode.adpter.MainViewPagerAdapter.TAG, "getPageTitle: ");
    return com.xiaohong.codecode.adpter.MainViewPagerAdapter.fragmentTitle[position];
}