public final void setPosition(com.snakybo.sengine.math.Vector3f position) {
    this.position = position;
    if (!(changed)) {
        if (!(position.equals(new com.snakybo.sengine.math.Vector3f()))) {
            changed = true;
        }
    }
}