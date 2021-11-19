@java.lang.Override
protected jmri.jmrit.display.Positionable finishClone(jmri.jmrit.display.controlPanelEditor.shape.PositionableShape pos) {
    if (!(pos instanceof jmri.jmrit.display.controlPanelEditor.shape.PositionablePolygon)) {
        throw new java.lang.IllegalArgumentException("parameter is not a PositionableRoundRect");
    }
    ((jmri.jmrit.display.controlPanelEditor.shape.PositionableRoundRect) (pos))._radius = _radius;
    return super.finishClone(pos);
}