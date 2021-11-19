@java.lang.Override
public void onSwipeLeft(android.support.v7.widget.RecyclerView recyclerView, int[] dismissedItems) {
    if ((dismissedItems != null) && ((dismissedItems.length) > 0)) {
        handleAcceptDecline(false, 0);
    }
}