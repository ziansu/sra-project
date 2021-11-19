public void update(long delta) {
    hub.update(mouseInput);
    myArcBallCamera.update(delta, mouseInput, keyboardInput.getCameraMove());
    selectionObject.moveMarker();
    selectionObject.select();
    selectionObject.updateObjectSelection();
}