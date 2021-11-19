public boolean removeMaterial(java.lang.String name) {
    org.bukkit.Material m = org.bukkit.Material.matchMaterial(name);
    return this.remove(m.name());
}