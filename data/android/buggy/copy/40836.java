@java.lang.Override
public void onDistanceFabClick() {
    checkLocationOn();
    homeFragment.setLocation(getLocation());
}