@java.lang.Override
public void removeMarkerClicked(com.google.android.gms.maps.model.LatLng latLng) {
    if ((mOnFocusChangedListener) != null) {
        mOnFocusChangedListener.onFocusChanged(null);
    }
    mBikeStationData.removeMarkerSelection();
}