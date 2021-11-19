@java.lang.Override
public void run() {
    saveCallRecord();
    android.view.animation.Animation animation = new android.view.animation.AlphaAnimation(1.0F, 0.0F);
    animation.setDuration(800);
    rootContainer.startAnimation(animation);
    finish();
}