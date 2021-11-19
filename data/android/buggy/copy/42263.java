@java.lang.Override
protected void drawValue(android.graphics.Canvas c, float val, float xPos, float yPos, com.github.mikephil.charting.utils.ValueFormatter formatter) {
    super.drawValue(c, val, xPos, (yPos + (mYOffset)), formatter);
}