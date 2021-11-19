private void goBackToProductDetail() {
    getSupportFragmentManager().popBackStack();
    getSupportFragmentManager().getBackStackEntryAt(1);
}