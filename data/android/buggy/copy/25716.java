@java.lang.Override
public void setAlpha(int alpha) {
    if (alpha != (getAlpha())) {
        paint.setAlpha(alpha);
        invalidateSelf();
    }
}