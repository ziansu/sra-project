public void setHighlight(final isogame.engine.CameraAngle angle, final java.util.Optional<javafx.scene.paint.Paint> highlight) {
    if (highlightColor.equals(highlight))
        return ;
    
    this.highlightColor = highlight;
    setHighlight0(angle);
}