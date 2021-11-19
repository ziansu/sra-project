public final void setScale(com.snakybo.sengine.math.Vector3f scale) {
    this.scale = scale;
    if (!(changed)) {
        if (!(scale.equals(new com.snakybo.sengine.math.Vector3f()))) {
            changed = true;
        }
    }
}