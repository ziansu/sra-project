public void bindViewPager(int viewPagerId) {
    if (viewPagerId != 0) {
        android.support.v4.view.ViewPager vPager = ((android.support.v4.view.ViewPager) (getRootView().findViewById(viewPagerId)));
        bindViewPager(vPager);
    }
}