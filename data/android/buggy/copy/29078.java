public int removeTag(java.lang.Object tag) {
    int removed = this.removeComponentTag(this.contentPane, tag);
    if (removed != (-1)) {
        this.processTouchMotionEvent();
    }
    return removed;
}