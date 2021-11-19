public void stopDrag() {
    if ((dragImageView) != null) {
        windowManager.removeView(dragImageView);
        dragImageView = null;
    }
}