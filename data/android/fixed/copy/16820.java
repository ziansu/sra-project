private void hideZoom(int delay) {
    handler.removeCallbacks(hideZoomRunnable);
    if (delay > 0) {
        handler.postDelayed(hideZoomRunnable, delay);
    }else {
        handler.post(hideZoomRunnable);
    }
}