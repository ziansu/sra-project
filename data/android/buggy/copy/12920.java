public void onAnimationEnd(android.animation.Animator animation) {
    if (!(mWasCanceled)) {
        revealView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        revealView.setClipToOutline(false);
        if (shouldRemoveElevationDuringAnimation()) {
            revealView.setTranslationZ(0);
        }
    }
}