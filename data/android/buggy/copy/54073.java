public void zoomInOn(@android.support.annotation.NonNull
com.google.android.gms.maps.model.LatLng latLng) {
    if (!(mIgnoreCameraZoom)) {
        com.github.dstaflund.geomemorial.common.util.CameraUpdateStrategy.zoomTo(mMap, mVisibleMarkers, latLng);
    }
}