@java.lang.Override
public void onMapReady(com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap) {
    map = mapboxMap;
    new com.mapbox.mapboxandroiddemo.examples.mas.TurfInsideActivity.DrawGeoJson().execute();
    map.setOnMapClickListener(this);
}