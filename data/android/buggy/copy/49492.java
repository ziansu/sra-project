@java.lang.Override
public void onPageSelected(int position) {
    mBottomBar.selectTabAtPosition(position, true);
    com.blanke.xzhihuday.base.BaseContentFragment fragment = baseContentFragments[position];
    fragment.initFab(fab);
}