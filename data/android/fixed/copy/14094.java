public boolean removeName(java.lang.String name) {
    boolean removed = this.removeComponentName(this.contentPane, name);
    if (removed) {
        this.processTouchMotionEvent();
    }
    return removed;
}