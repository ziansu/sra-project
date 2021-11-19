public void clear() {
    synchronized(visibleItems) {
        mLastPosition = 0;
        visibleItems.clear();
        notifyDataSetChanged();
    }
}