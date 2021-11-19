public void goToMyProfileFragment() {
    popEveryFragment();
    hideMapFragment();
    open(new com.angular.gerardosuarez.carpoolingapp.fragment.MyProfileFragment(), MyProfileFragment.TAG);
}