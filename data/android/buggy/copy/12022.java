@java.lang.Override
protected void dispatchDraw(android.graphics.Canvas canvas) {
    super.dispatchDraw(canvas);
    onUpdateScrollbar();
    mScrollbar.draw(canvas);
}