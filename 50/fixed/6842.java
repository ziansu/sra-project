private void drawJustified(android.graphics.Canvas canvas) {
    if ((this.getLayout()) == null) {
        return ;
    }
    drawJustified(canvas, this.getLayout());
}