public void goToMapFragment() {
    popEveryFragment();
    java.lang.String role = rolePreference.getCurrentRole();
    if (com.angular.gerardosuarez.carpoolingapp.utils.StringUtils.isEmpty(role)) {
        return ;
    }
    openMapFragment(new com.angular.gerardosuarez.carpoolingapp.fragment.MyMapFragment(), MyMapFragment.TAG);
}