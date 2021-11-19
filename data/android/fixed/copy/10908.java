@org.bukkit.event.EventHandler
public void onArmorStandDestroy(org.bukkit.event.entity.EntityDeathEvent event) {
    if ((event.getEntity().getUniqueId().equals(armorStand.getUniqueId())) && (open)) {
        destroy();
        player.closeInventory();
    }
}