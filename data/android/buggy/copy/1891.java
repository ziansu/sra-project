public void render() {
    if (newDataFlag) {
        checkClearCanvas();
        drawDivider();
        testPastureDraw();
        drawCursor();
        resetFlag();
    }else {
    }
}