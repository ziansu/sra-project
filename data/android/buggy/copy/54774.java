@java.lang.Override
protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
    float trans = interpolatedTime * totalHeight;
    mToolbarLayout.setTranslationY((trans - totalHeight));
    setWebViewTranslation(trans);
}