@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    start();
    if ((getChildCount()) == 0) {
        createAircraft();
    }
}