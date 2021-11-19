public static void register(org.bukkit.plugin.Plugin plugin) {
    if (de.CodingAir.v1_6.CodingAPI.Player.GUI.GUIListener.registered)
        return ;
    
    org.bukkit.Bukkit.getPluginManager().registerEvents(new de.CodingAir.v1_6.CodingAPI.Player.GUI.GUIListener(), plugin);
    de.CodingAir.v1_6.CodingAPI.Player.GUI.GUIListener.registered = true;
}