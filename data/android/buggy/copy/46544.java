@java.lang.Override
public void onSwipeRight(android.support.v7.widget.RecyclerView recyclerView, int[] dismissedItems) {
    if ((dismissedItems != null) && ((dismissedItems.length) > 0)) {
        handleAcceptDecline(true, 0);
    }
}