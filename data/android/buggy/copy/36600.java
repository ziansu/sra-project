public void removeTribe(com.tealcube.minecraft.bukkit.tribes.data.Tribe tribe) {
    com.google.common.base.Preconditions.checkNotNull(tribe);
    com.google.common.base.Preconditions.checkState(tribeMap.containsKey(tribe.getUniqueId()));
    tribeMap.remove(tribe.getUniqueId());
}