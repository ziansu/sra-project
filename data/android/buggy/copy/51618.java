public com.joanfuentes.hintcase.HintCase setShapeAnimators(com.joanfuentes.hintcase.ShapeAnimator showShapeAnimator, com.joanfuentes.hintcase.ShapeAnimator hideShapeAnimator) {
    int offsetInPx = com.joanfuentes.hintcase.utils.DimenUtils.dipToPixels(context, com.joanfuentes.hintcase.HintCase.DEFAULT_SHAPE_OFFSET_IN_DP);
    this.hintCaseView.setShape(offsetInPx, showShapeAnimator, hideShapeAnimator);
    return this;
}