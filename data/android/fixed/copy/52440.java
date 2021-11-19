boolean check() {
    if ((org.bukkit.Bukkit.getServer().getPluginManager().getPlugin("MagicTitles")) != null) {
        this.MMAGIC_TITLES = true;
        return true;
    }else
        this.MMAGIC_TITLES = false;
    
    return false;
}