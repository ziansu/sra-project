public void onAnimationEnd(android.animation.Animator animation) {
    if (!(mWasCanceled)) {
        if (shouldRemoveElevationDuringAnimation()) {
            revealView.setTranslationZ(0);
        }
    }
}