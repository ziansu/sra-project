public void myDraw(android.graphics.Canvas canvas) {
    canvas.drawBitmap(mBitmapBackground, 0, 0, null);
    mGroup.drawAll(canvas);
}