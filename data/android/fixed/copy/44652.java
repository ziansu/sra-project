public static void setMessage(org.bukkit.entity.Player player, java.lang.String text) {
    if (one.lindegaard.MobHunting.compatibility.ActionBarAPICompat.supported) {
        com.connorlinfoot.actionbarapi.ActionBarAPI.sendActionBar(player, text);
    }
}