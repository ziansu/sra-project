private void touch_up() {
    mPath.lineTo(mX, mY);
    mCanvas.drawPath(mPath, mPaint);
    mPath.reset();
}