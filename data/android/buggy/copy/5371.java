public void openFragmentNoHistory(android.support.v4.app.Fragment fragment, java.lang.String tag) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.container, fragment, tag);
    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    ft.commitAllowingStateLoss();
}