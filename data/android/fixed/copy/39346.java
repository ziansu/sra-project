private boolean sendSwipe(de.viktorreiser.toolbox.widget.SwipeableListItem.SwipeEvent type) {
    if ((mSwipeableView) != null) {
        return mSwipeableView.onViewSwipe(this, type, mSwipeOffset, mSwipeablePosition);
    }else {
        return false;
    }
}