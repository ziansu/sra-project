public void resetAnimation(int animationId) {
    animations.get(animationId).resetAnimation();
    currentAnimation = animationId;
}