@java.lang.Override
public void stop() {
    if ((mGamepadView) != null)
        mGamepadView.setVisibility(View.INVISIBLE);
    
    if ((mPointerLayer) != null)
        mPointerLayer.setVisibility(View.INVISIBLE);
    
    isPaused = true;
}