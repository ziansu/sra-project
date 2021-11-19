public void rendererDispose() {
    gWorld.getWorld().dispose();
    rayHandler.dispose();
    stage.dispose();
    b2dr.dispose();
}