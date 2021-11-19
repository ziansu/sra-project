public void enable() {
    if ((Build.VERSION.SDK_INT) == 19) {
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}