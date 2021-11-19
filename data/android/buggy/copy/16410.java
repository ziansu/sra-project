@java.lang.Override
public void initiateEntityPet() {
    ((org.bukkit.entity.Tameable) (getBukkitEntity())).setOwner(org.bukkit.Bukkit.getOfflinePlayer(getPet().getOwnerUUID()));
}