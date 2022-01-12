@java.lang.Override
public void onVisibilityChanged(boolean visible) {
    handler.removeCallbacks(drawRunner);
    this.visible = visible;
    if (visible) {
        handler.post(drawRunner);
    }
}