public void DoDraw(android.graphics.Canvas c) {
    c.save();
    listener.drawing(c);
    c.restore();
}