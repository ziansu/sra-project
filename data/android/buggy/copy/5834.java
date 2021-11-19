@java.lang.Override
protected java.lang.Object autoRange(double length) {
    this.setSide((((getSide()) == null) || (getSide().isHorizontal()) ? javafx.geometry.Side.TOP : javafx.geometry.Side.LEFT));
    return null;
}