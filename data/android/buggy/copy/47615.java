public int getProcotolVersion(org.bukkit.entity.Player player) {
    return ((java.lang.Integer) (net.md_5.itag.iTag.getProtocolVersion.invoke(com.comphenix.protocol.utility.MinecraftFields.getNetworkManager(player))));
}