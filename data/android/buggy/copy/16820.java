private void hideZoom(int delay) {
    handler.removeCallbacks(hideZoomRunnable);
    if (delay > 0) {
        handler.postDelayed(hideZoomRunnable, 5000);
    }else {
        handler.post(hideZoomRunnable);
    }
}