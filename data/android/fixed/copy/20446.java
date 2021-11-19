public final void closeHiddenView() {
    if ((currentSwipeableHiddenView) != null) {
        currentSwipeableHiddenView.onViewSwipe(null, SwipeEvent.CLOSE, 0, 0, null);
    }
}