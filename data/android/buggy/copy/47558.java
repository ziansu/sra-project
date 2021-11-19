public void setPhysicsWorld(org.bukkit.World w) {
    this.current = w;
    if (w == null)
        pe.end();
    else
        pe.start(w.getName());
    
}