@java.lang.Override
public void onMarkerDragEnd(com.google.android.gms.maps.model.Marker arg0) {
    com.google.android.gms.maps.model.LatLng markerLocation = marker.getPosition();
    android.widget.Toast.makeText(mainActivity, markerLocation.toString(), Toast.LENGTH_LONG).show();
    selectedLatLng = markerLocation;
    android.util.Log.d("Marker", "finished");
}