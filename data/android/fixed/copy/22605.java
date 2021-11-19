private boolean canChildDragDown() {
    ensureTarget();
    return android.support.v4.view.ViewCompat.canScrollVertically(mTarget, (-1));
}