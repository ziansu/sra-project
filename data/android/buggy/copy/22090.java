@java.lang.Override
protected void adjustAnchorOffsetXY(android.view.View child, float[] anchorOffsetXY) {
    anchorOffsetXY[0] = (child.getHeight()) / 2.0F;
}