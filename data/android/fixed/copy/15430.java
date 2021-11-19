public static boolean give(org.bukkit.entity.Player player, fr.moribus.imageonmap.map.SingleMap map) {
    return fr.moribus.imageonmap.ui.MapItemManager.give(player, fr.moribus.imageonmap.ui.MapItemManager.createMapItem(map));
}