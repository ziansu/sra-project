public void hideProgress() {
    if (((isProgress) == true) && ((mSuccessAnimationState.key) >= (com.miruker.fabprogress.Fab.SUCCESS_ANIMATION.END_ANIMATING.key))) {
        isProgress = false;
        invalidate();
    }
}