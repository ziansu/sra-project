private android.view.ViewPropertyAnimator animateOffScreenLeft(int duration) {
    return card.animate().setDuration(SwipeDeck.ANIMATION_DURATION).x((-(parentWidth))).y(0).rotation((-30));
}