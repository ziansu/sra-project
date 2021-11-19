private void addPolylineToMap() {
    line = mMap.addPolyline(new com.google.android.gms.maps.model.PolylineOptions().width(10).color(Color.BLUE));
    lines.add(line);
    android.util.Log.i("Development", "addPolylineToMap");
}