@java.lang.Override
public void drawRect(int x, int y, int w, int h) {
    currentPaint.setStyle(Paint.Style.STROKE);
    back.drawRect(x, y, (x + w), (y + h), currentPaint);
}