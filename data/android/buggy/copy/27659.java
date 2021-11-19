public void draw(android.graphics.Canvas canvas) {
    canvas.drawBitmap(resized, x, y, null);
    android.util.Log.i("x", java.lang.String.valueOf(x));
    android.util.Log.i("y", java.lang.String.valueOf(y));
}