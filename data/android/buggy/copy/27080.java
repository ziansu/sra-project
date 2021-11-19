private void showFragment() {
    com.archide.hsb.view.fragments.OrderPlaceFragment orderPlaceFragment = new com.archide.hsb.view.fragments.OrderPlaceFragment();
    com.archide.hsb.view.fragments.FragmentsUtil.addFragment(this, orderPlaceFragment, R.id.main_container);
}