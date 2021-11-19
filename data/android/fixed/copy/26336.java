private void hidePreview() {
    params.width = 1;
    params.height = 1;
    params.alpha = 1;
    try {
        windowManager.updateViewLayout(sv, params);
    } catch (java.lang.IllegalArgumentException e) {
    }
}