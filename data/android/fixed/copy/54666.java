static java.lang.String toBlockHash(org.bukkit.Location location) {
    if (location == null)
        return null;
    
    return se.fredsfursten.telepadplugin.TelePadInfo.toBlockHash(location.getBlock());
}