@java.lang.Override
public void onPageSelected(int position) {
    mBottomBar.selectTabAtPosition(position);
    com.blanke.xzhihuday.base.BaseContentFragment fragment = baseContentFragments[position];
}