public void setPosition(com.shc.silenceengine.math.Vector3 position) {
    this.position.set(position);
    if ((bounds) != null)
        bounds.setPosition(position);
    
}