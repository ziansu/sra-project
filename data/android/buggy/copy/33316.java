@java.lang.Override
public void onPause() {
    super.onPause();
    gps.stopGPS();
    com.pommerening.quinn.foodtruck.fragment.MiniMapFragment.toggle = true;
}