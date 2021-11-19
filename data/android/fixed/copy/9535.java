@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    handler.post(createRunnable(parent, startTime, startScale, endScale));
    parent.init();
    can_scroll = false;
}