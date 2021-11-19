public void myDraw(android.graphics.Canvas canvas) {
    canvas.drawBitmap(mBitmapBackground, 0, 0, null);
    android.util.Log.d(com.example.balloonpop.GameView.TAG, "myDraw draw background");
    mGroup.drawAll(canvas);
}