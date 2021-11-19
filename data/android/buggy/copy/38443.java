public void translate(com.badlogic.gdx.math.Vector3 offset) {
    coordinates.add(offset);
    globalCoordinates.add(offset);
    for (com.zalmoxis3d.display.DisplayObject child : this.children) {
        child.calculateGlobalCoordinates();
    }
}