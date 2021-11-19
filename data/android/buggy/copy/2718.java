@java.lang.Override
public void onClick(android.view.View v) {
    org.osmdroid.views.overlay.TilesOverlay orthophotoOverlay = ((org.osmdroid.views.overlay.TilesOverlay) (mapView.getOverlayManager().get(0)));
    showOrtophoto = !(showOrtophoto);
    orthophotoOverlay.setEnabled(showOrtophoto);
    mapView.invalidate();
}