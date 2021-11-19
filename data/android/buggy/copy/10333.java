@java.lang.Override
public void onClick(android.view.View v) {
    mapView.setCenterCoordinate(new com.mapbox.mapboxsdk.geometry.LatLng(mCurrentLocation));
}