public void init(android.util.AttributeSet attrs) {
    try {
        setWillNotDraw(false);
        setupAttributes(attrs);
        setGravity(Gravity.CENTER);
        setupAnimators();
        setupPaint();
    } catch (java.lang.Exception ignored) {
    }
}