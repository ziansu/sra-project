private void setCurrentDragEdge(com.daimajia.swipe.SwipeLayout.DragEdge dragEdge) {
    if ((mCurrentDragEdge) != dragEdge) {
        mCurrentDragEdge = dragEdge;
        updateBottomViews();
    }
}