private void drawSelf(android.graphics.Canvas canvas) {
    android.graphics.Paint paint = new android.graphics.Paint();
    paint.setColor(Color.BLUE);
    canvas.drawCircle(rx, ry, (2 * (radius)), paint);
}