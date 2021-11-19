public void initAssess() {
    unsentFragment = new org.eyeseetea.malariacare.fragments.DashboardUnsentFragment();
    unsentFragment.setArguments(getIntent().getExtras());
    replaceListFragment(R.id.dashboard_details_container, unsentFragment);
}