public void terminate() {
    this.terminated = true;
    if ((this.getWorld()) != null)
        this.getWorld().removeFromWorld(this);
    
    this.associatedWorld = null;
    this.velocity = null;
}