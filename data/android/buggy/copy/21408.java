public void addControl(it.geosolutions.android.map.control.MapControl m) {
    controls.add(m);
    android.util.Log.v("CONTROL", ("total controls:" + (controls.size())));
}