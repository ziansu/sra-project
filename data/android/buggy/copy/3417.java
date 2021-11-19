@java.lang.Override
public void onPageSelected(int page) {
    if (page == 0) {
        mBottomRl.setVisibility(View.VISIBLE);
    }else {
        mBottomRl.setVisibility(View.GONE);
    }
    setSubmenuIndex((page + 1));
}