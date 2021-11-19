public void init(int arcColor, int arcWidth, boolean roundedStroke) {
    setupInitialAlpha();
    com.github.jorgecastilloprz.progressarc.ProgressArcDrawable arcDrawable = new com.github.jorgecastilloprz.progressarc.ProgressArcDrawable(arcWidth, arcColor, roundedStroke);
    setIndeterminateDrawable(arcDrawable);
}