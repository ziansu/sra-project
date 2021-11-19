@java.lang.Override
public void onAnimationStart(android.animation.Animator animator) {
    gameView.animatedCards.add(cardView.getCard());
    gameView.drawQueue();
    super.onAnimationStart(animator);
}