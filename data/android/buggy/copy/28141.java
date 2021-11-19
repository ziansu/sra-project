public org.bukkit.Sound getBukkit() {
    if (org.bitbucket.ucchy.cr.Utility.isCB19orLater())
        return org.bukkit.Sound.valueOf(v18name);
    
    return org.bukkit.Sound.valueOf(v19name);
}