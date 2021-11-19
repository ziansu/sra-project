public org.bukkit.Sound getBukkit(org.bukkit.Sound def) {
    if (org.bitbucket.ucchy.cr.Utility.isCB19orLater())
        return getSound(v19name, def);
    
    return getSound(v18name, def);
}