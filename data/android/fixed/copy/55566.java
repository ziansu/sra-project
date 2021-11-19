public void setGravity(com.jme3.math.Vector3f gravity) {
    this.gravity.set(gravity);
    setGravity(physicsSpaceId, gravity);
}