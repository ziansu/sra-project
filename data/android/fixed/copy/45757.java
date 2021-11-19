@java.lang.Override
protected void interpolate(double frac) {
    double curWidth = (width) * frac;
    pane.setPrefWidth(curWidth);
    pane.setTranslateX((curWidth - (width)));
}