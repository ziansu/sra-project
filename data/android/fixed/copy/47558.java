public void setPhysicsWorld(org.bukkit.World w) {
    if (w == null)
        pe.end();
    else
        pe.start(w.getName());
    
}