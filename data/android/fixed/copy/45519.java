private void setupWelcomeFragment() {
    org.physical_web.cms.WelcomeFragment welcomeFragment = new org.physical_web.cms.WelcomeFragment();
    getFragmentManager().beginTransaction().add(R.id.fragment_container, welcomeFragment).commit();
}