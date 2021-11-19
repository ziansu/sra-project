@java.lang.Override
public void updateBus() {
    android.util.Log.i(com.ikardwynne.wheresthatbus.MainActivity.TAG, "Updating the location of the bus");
    action = null;
    mapFrag = getMapFragment(true);
    getFragmentManager().beginTransaction().replace(R.id.container, mapFrag).commit();
}