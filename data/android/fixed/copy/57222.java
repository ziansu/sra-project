public com.comphenix.protocol.wrappers.WrappedGameProfile checkClone(org.bukkit.entity.Player player, com.comphenix.protocol.wrappers.WrappedGameProfile profile) {
    return (profile.getHandle()) == (net.md_5.itag.iTag.playerProfile.invoke(player)) ? clone(profile) : profile;
}