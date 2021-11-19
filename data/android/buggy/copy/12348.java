protected void drawValue(android.graphics.Canvas c, float val, float xPos, float yPos, com.github.mikephil.charting.utils.ValueFormatter formatter) {
    java.lang.String value = formatter.getFormattedValue(val);
    c.drawText(value, xPos, yPos, mValuePaint);
}