@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    if (listener != null) {
        listener.onOpen();
    }
}