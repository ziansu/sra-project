private void doDraw(android.graphics.Canvas canvas) {
    canvas.save();
    canvas.scale(oscale, oscale, mx, my);
    canvas.drawBitmap(BackgroundImage, mx, my, null);
    canvas.restore();
}