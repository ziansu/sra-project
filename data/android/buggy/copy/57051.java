@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    if ((months.isEmpty()) && (!(isInEditMode()))) {
        throw new java.lang.IllegalStateException("Must have at least one month to display.  Did you forget to call init()?");
    }
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
}