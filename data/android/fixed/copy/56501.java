public java.lang.String getName() {
    return org.bukkit.Material.getMaterial(this.type).name().replace('_', ' ');
}