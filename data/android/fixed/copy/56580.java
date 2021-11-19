@java.lang.Override
protected void interpolate(double frac) {
    double curWidth = (width) * (1.0 - frac);
    pane.setPrefWidth(curWidth);
    pane.setTranslateX(0);
}