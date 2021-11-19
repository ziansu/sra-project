@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    progressView.setVisibility(View.VISIBLE);
    buildRestaurantMapPopUp(fm, marker);
    return true;
}