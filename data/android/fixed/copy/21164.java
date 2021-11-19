@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    view.setVisibility(View.GONE);
    searchView.setVisibility(View.GONE);
    if (listener != null) {
        listener.onClose();
    }
}