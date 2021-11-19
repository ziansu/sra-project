@java.lang.Override
public void effect(org.bukkit.event.Event e, org.bukkit.inventory.ItemStack item, int level) {
    if (e instanceof org.bukkit.event.entity.EntityShootBowEvent) {
        if (level == 1) {
            volley(((org.bukkit.event.entity.EntityShootBowEvent) (e)), item, level);
        }
    }
}