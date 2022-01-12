public void sendPacketsTo(org.bukkit.entity.Player player, net.minecraft.server.v1_9_R1.Packet<?>... packet) {
    java.util.ArrayList<org.bukkit.entity.Player> it = new java.util.ArrayList<org.bukkit.entity.Player>();
    it.add(player);
    sendPacketsTo(it, packet);
}