private void setupViewPager() {
    viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.viewPager)));
    viewPagerAdapter = new sneer.android.ui.ConvoActivityWithTabs.ViewPagerAdapter(getSupportFragmentManager());
    viewPager.setAdapter(viewPagerAdapter);
}