@java.lang.Override
public void setAlpha(int alpha) {
    if (alpha != (paint.getAlpha())) {
        paint.setAlpha(alpha);
        invalidateSelf();
    }
}