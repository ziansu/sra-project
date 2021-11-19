@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    android.widget.Toast.makeText(getApplicationContext(), (((getString(R.string.location)) + (com.assignment.doormint.common.Constants.ST_COLON)) + location), Toast.LENGTH_SHORT).show();
    return true;
}