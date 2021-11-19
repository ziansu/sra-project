private void goToRegisterFragment() {
    popEveryFragment();
    hideMapFragment();
    open(new com.angular.gerardosuarez.carpoolingapp.fragment.RegisterFragment(), RegisterFragment.TAG);
}