public void handle(javafx.scene.input.MouseEvent me) {
    mouseOverOctagon = true;
    textOctagonHeightModifier = (9 / 13) * (cardHeight);
    updateTextOctagon();
    middleTextOctagon.setStroke(javafx.scene.paint.Color.YELLOW);
}