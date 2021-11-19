@java.lang.Deprecated
public void spawn(final com.jme3.scene.Node node, final com.jme3.bullet.PhysicsSpace space, final com.jme3.math.Vector3f location) {
    spawn(node, space);
    setLocation(location);
}