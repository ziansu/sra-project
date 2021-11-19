@java.lang.Override
protected void onDraw(android.graphics.Canvas c) {
    b.setCanvas(c, getWidth(), getHeight());
    if ((board) != null)
        board.paint(b);
    
}