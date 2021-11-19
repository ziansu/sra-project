public void checkForNewAnimations(Game.View.RenderInfo renderInfo) {
    if (!(settings.isConsoleMode())) {
        animator.startAnimation(renderInfo.toAnimate);
    }
}