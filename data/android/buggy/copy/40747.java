public void sendTime(cn.nukkit.Player... players) {
    cn.nukkit.level.SetTimePacket pk = new cn.nukkit.level.SetTimePacket();
    pk.time = ((int) (6000));
    cn.nukkit.Server.broadcastPacket(players, pk);
}