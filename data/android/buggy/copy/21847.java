@java.lang.Override
public void onAnimationStart(final android.animation.Animator animation) {
    if (!(isCancelled())) {
        imageView.setAlpha(0.0F);
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(artwork);
    }
}