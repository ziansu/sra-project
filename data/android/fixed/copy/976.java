private void notifyScrollDirection(int dx, int dy) {
    if (dy < 0) {
        directionScrollListener.onDirectionScroll(true);
    }else
        if (dy > 0) {
            directionScrollListener.onDirectionScroll(false);
        }
    
}