public void setColor(int color) {
    strokeColor = color;
    if (eraserOn)
        mPaint.setColor(color);
    
}