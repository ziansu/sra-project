@java.lang.Override
public void onAnimationStart(android.animation.Animator animator) {
    gameView.player.getCardsQueue().addFirst(GameConstants.NOT_A_CARD);
    gameView.player.updateOneMove();
    super.onAnimationStart(animator);
}