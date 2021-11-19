@java.lang.Override
public void addOverlay(android.view.ViewGroup sceneRoot, android.view.View overlayView, int screenX, int screenY) {
    android.transitions.everywhere.utils.ViewOverlayPreJellybean viewOverlay = android.transitions.everywhere.utils.ViewOverlayPreJellybean.getOverlay(sceneRoot);
    if (viewOverlay != null) {
        viewOverlay.addView(overlayView, screenX, screenY);
    }
}