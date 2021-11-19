public void setStateRevealed() {
    changeState(de.wackernagel.android.sidekick.widgets.CircularRevealView.STATE_REVEALED);
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}