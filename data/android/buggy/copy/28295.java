@java.lang.Override
public void moveHandleToPosition(float scrollProgress) {
    mHandle.setY(mScreenPositionCalculator.getYPositionFromScrollProgress(scrollProgress));
}