public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) {
    boolean ret = super.dispatchPopulateAccessibilityEvent(event);
    if ((mPluginActivity) != null) {
        return mPluginActivity.dispatchPopulateAccessibilityEvent(event);
    }
    return ret;
}