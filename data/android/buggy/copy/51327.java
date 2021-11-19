public void recenterCamera() {
    camMain.position.set(0.0F, 0.0F, 3.0F);
    camMain.up.set(0, 1, 0);
    camMain.lookAt(initLookAt);
    camMain.update();
}