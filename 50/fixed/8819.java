@java.lang.Override
public void onCameraChange(com.google.android.gms.maps.model.CameraPosition arg0) {
    if (ignoreNextChange) {
        ignoreNextChange = false;
    }else {
        centerOnMylocation = false;
    }
}