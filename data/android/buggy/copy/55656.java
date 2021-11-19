@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    arret = marker.getTitle();
    btn8.setText(("Arrêt : " + (arret)));
    return false;
}