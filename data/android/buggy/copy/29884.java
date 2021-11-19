void clear(android.transition.Transition.TransitionListener transitionListener) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        transition.removeListener(transitionListener);
    }
    this.transitionListener = null;
    this.transition = null;
}