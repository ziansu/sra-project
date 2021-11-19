public void setGlobalRotation(float rotation) {
    if ((parent) == null) {
        this.rotation = rotation;
        return ;
    }
    this.rotation = (parent.getGlobalRotation()) - rotation;
}