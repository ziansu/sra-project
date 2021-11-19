@java.lang.Override
public void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) {
    super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    org.mozilla.gecko.GeckoAccessibility.onLayerViewFocusChanged(this, gainFocus);
}