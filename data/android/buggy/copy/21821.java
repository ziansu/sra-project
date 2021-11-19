@java.lang.Override
public void stop() {
    mGamepadView.setVisibility(View.INVISIBLE);
    mPointerLayer.setVisibility(View.INVISIBLE);
    isPaused = true;
}