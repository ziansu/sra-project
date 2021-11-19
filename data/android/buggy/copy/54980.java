@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    int height = getHeight();
    setMeasuredDimension(height, height);
}