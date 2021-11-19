public void putObjectCenter(tk.ubublik.redivansion.gamelogic.units.objects.WorldObject worldObject) {
    worldObject.setPosition(mapRenderer.worldPointToMap(cameraControl.getCameraCenterPoint()));
    putObject(worldObject);
}