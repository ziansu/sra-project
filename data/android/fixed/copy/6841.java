protected java.awt.Shape getScreenTranslatedShape() {
    java.awt.geom.AffineTransform at = java.awt.geom.AffineTransform.getTranslateInstance(xLoc, yLoc);
    return at.createTransformedShape(getLocallyTransformedShape());
}