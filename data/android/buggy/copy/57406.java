void dispatchOnPanelStateChanged(android.view.View panel, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState previousState, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState newState) {
    for (com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener l : mPanelSlideListeners) {
        l.onPanelStateChanged(panel, previousState, newState);
    }
    sendAccessibilityEvent(AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED);
}