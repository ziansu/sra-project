private void presentQuestionTeardown(int delay, final io.codetail.animation.SupportAnimator.SimpleAnimatorListener listener) {
    disableAnswerButtons();
    presentAnswerButtonCollapseAnimation(delay, new io.codetail.animation.SupportAnimator.SimpleAnimatorListener() {
        @java.lang.Override
        public void onAnimationEnd() {
            presentResponseTextCollapseAnimation(questionText, listener);
        }
    });
}