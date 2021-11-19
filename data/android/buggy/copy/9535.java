@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    handler.post(createRunnable(parent, startTime, startScale, endScale));
    can_scroll = false;
}