public com.massivecraft.massivecore.mson.Mson tooltip(org.bukkit.inventory.ItemStack item) {
    this.hoverEvent(com.massivecraft.massivecore.mson.MsonEvent.item(item));
    return this;
}