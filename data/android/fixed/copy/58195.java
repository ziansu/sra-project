public void setUpViewPager() {
    vpPager.setAdapter(new com.codepath.apps.finch.activities.ProfileActivity.UserProfilePageAdapter(getSupportFragmentManager()));
    tabStrip.setViewPager(vpPager);
}