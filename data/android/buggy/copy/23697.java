public void setGlobalRotation(float rotation) {
    if ((parent) == null) {
        this.rotation = rotation;
    }
    this.rotation = (parent.getGlobalRotation()) - rotation;
}