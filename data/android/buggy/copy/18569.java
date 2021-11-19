public void draw(android.graphics.Canvas canvas, android.graphics.Paint paint) {
    com.idonans.acommon.lang.CommonLog.d(((com.idonans.doodle.DoodleView.Render.CanvasBuffer.TAG) + " draw"));
    refreshBuffer(paint);
    canvas.drawBitmap(mBitmap, 0.0F, 0.0F, paint);
}