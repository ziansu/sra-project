public void showFragment(android.support.v4.app.Fragment fragment) {
    if (null != fragment) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.show(fragment);
        fragmentTransaction.commit();
    }
}