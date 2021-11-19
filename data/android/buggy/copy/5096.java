public void bindYtoX() {
    endXProperty().addListener((negated ? bindXYNegatedListener : bindXYListener));
    setEndY((negated ? 255 - (getX().getValue()) : getX().getValue()));
}