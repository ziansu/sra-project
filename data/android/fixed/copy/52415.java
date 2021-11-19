@java.lang.Override
public void setFrameRate(double frameRate) {
    mFrameRate = frameRate;
    if (stopRendering()) {
        startRendering();
    }
}