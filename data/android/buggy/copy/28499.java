@java.lang.Override
public void unSelect(boolean setActiveColor, int animationDuration) {
    labelView.animate().scaleX(1).scaleY(1).setDuration(animationDuration).start();
    super.unSelect(setActiveColor, animationDuration);
}